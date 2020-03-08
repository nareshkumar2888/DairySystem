package edu.jspiders.dairysystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.dairysystem.dao.LoginOperations;
import edu.jspiders.dairysystem.dao.MilkRateOperations;
import edu.jspiders.dairysystem.dao.SellerOperations;
import edu.jspiders.dairysystem.dao.StaffOperations;
import edu.jspiders.dairysystem.dto.Login;
import edu.jspiders.dairysystem.dto.Seller;
import edu.jspiders.dairysystem.dto.Staff;

@Controller
public class MyController {

	@Autowired
	StaffOperations staffoperations;
	@Autowired
	MilkRateOperations milkrateoperations;
	@Autowired
	SellerOperations selleroperations;

	@RequestMapping(value= {"/index","/"})
	public String getIndexPage() {
		return "index";
	}

	@RequestMapping("/login")
	public String getLoginPage() {

		return "login";
	}

	@RequestMapping("/dashboard")
	public String getDashBoard(HttpServletRequest req, Model loginModel,HttpSession session) {
		String username = req.getParameter("user");
		
		String password = req.getParameter("pswd");

		LoginOperations operations = new LoginOperations();

		Login login = operations.loginValidation(username, password);
		
		if (login != null) {
			session.setAttribute("username", username);

			loginModel.addAttribute("type", login.getType());
			return "dashboard";
		} else {
			loginModel.addAttribute("type", "Invalid Access");
			return "dashboard";
		}

	}

	@RequestMapping("/manageStaff")
	public String getManageStaff() {
		return "manageStaff";

	}

	@RequestMapping("/addStaff")
	public String getAddStaff(Model model) {
		Staff staff = new Staff();
		model.addAttribute("staff", staff);
		return "addStaff";
	}

	@RequestMapping("/insertStaff")
	public String insertStaff(@ModelAttribute("staff") Staff staff, Model model) {
		staffoperations  = new StaffOperations();
		if (staffoperations.insert(staff)) {
			model.addAttribute("status", "successfully added!!!!");
			return "redirect:/manageStaff";

		} else {
			model.addAttribute("status", "not inserted");
			return "redirect:/addStaff";

		}

	}

	@RequestMapping("/viewStaff")
	public String getStaffDetails(Model model) {
		staffoperations = new StaffOperations();
		List<Staff> staff = staffoperations.displyAllStaff();
		model.addAttribute("viewstaff", staff);

		return "viewStaff";
	}

	@RequestMapping("/updateStaff")
	public String updateStaff() {
		return "updateStaff";

	}

	@RequestMapping("/updateStaffForm")
	public String getUpdateStaffForm(HttpServletRequest req, Model model) {
		String id = req.getParameter("id");
		staffoperations = new StaffOperations();
		Staff staff = staffoperations.search(Integer.parseInt(id));
		if(staff!=null) {
		model.addAttribute(staff);
		return "updateStaffForm";
		}
		else {
			model.addAttribute("staff","No Staff found!!!");
			return "updateStaff";
		}
	}

	@RequestMapping("/updateStaff1")
	public String updateMovie(@ModelAttribute("staff") Staff staff, Model model) {
		System.out.println(staff);
		staffoperations= new StaffOperations();
		staffoperations.updateStaff(staff);

		return "updateStaff1";

	}

	@RequestMapping("/deleteStaff")
	public String deleteStaff(HttpServletRequest req, Model model) {
		
		staffoperations  = new StaffOperations();
		Staff staff = staffoperations.search(Integer.parseInt(req.getParameter("id")));
		if (staff != null) {
			staffoperations.deleteStaff(staff);
			model.addAttribute("deleteStaff", staff+" \n deleted!!!");
			return "deleteStaff";

		} else {
			model.addAttribute("deleteStaff", "No Staff Found!!!");
			return "deleteStaff";

		}

	}

	@RequestMapping("/searchStaff")
	public String searchStaff() {

		return "searchStaff";
	}

	@RequestMapping("/manageSeller")
	public String getManageSeller() {
		return "Seller/manageSeller";
	}

	@RequestMapping("/addSellerForm")
	public String addSeller(Model model) {
		Seller seller = new Seller();
		model.addAttribute("addSeller", seller);
		return "Seller/addSellerForm";
	}

	@RequestMapping("/insertSeller")
	public String insertSeller(@ModelAttribute("addSeller") Seller seller, Model model) {
		selleroperations  = new SellerOperations();
		if (selleroperations.insert(seller)) {
			model.addAttribute("status", "successfully added!!!!");
			return "redirect:/manageSeller";
		} else {
			model.addAttribute("status", "Not added!!!");
			return "redirect:/addSellerForm";
		}
	}

	@RequestMapping("/viewSeller")
	public String viewSeller(Model model) {
		selleroperations = new SellerOperations();
		List<Seller> seller = selleroperations.displySeller();
		model.addAttribute("viewSeller", seller);
		return "Seller/viewSeller";

	}

	@RequestMapping("/searchSeller")
	public String getSearch() {
		return "Seller/searchSeller";
	}

	@RequestMapping("/updateSellerForm")
	public String getUpdateForm(HttpServletRequest req, Model model) {

		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		selleroperations  = new SellerOperations();
		Seller seller = selleroperations.searchSeller(id1);
		if(seller!=null) {
			model.addAttribute(seller);
			return "Seller/updateSellerForm";
		}else {
			model.addAttribute("seller","No Seller Found!!!");
			return "Seller/searchSeller";

		}

	}
	
	@RequestMapping("/updateSeller")
	public String getUpdateSeller(@ModelAttribute("seller")Seller seller,Model model) {
		selleroperations  = new SellerOperations();
		selleroperations.updateSeller(seller);
		model.addAttribute("updated", "Updated Successfully!!!!");
		return "Seller/updateSeller";
		
	}
	
	@RequestMapping("/deleteSeller")
	public String deleteSeller() {
		return "Seller/deleteSeller";
	}

	@RequestMapping("/deleteSeller1")
	public String  getDeleteSeller(HttpServletRequest req,Model model) {
			
		selleroperations =new SellerOperations();
		Seller seller=selleroperations.searchSeller(Integer.parseInt(req.getParameter("id")));
		if(seller!=null) {
			selleroperations.deleteSeller(seller);
			model.addAttribute("status","Seller is Deleted!!!");
			return "Seller/deleteSeller1";
		}else {
			model.addAttribute("status", "Seller Not Found");
			return "Seller/deleteSeller1";

		}
		
	}
	
	@RequestMapping("/manageMilk")
	public String manageMilk(Model model) {
		
		ArrayList<Double> data=milkrateoperations.getMaxFatAndDate();
		
		model.addAttribute("data",data);
		
		return "Milk/manageMilk";
	}
	
	@RequestMapping("/updateMilkRate")
	public String getUpdateMilkRAtesPage() {
		return "Milk/updateMilkRate";
	}
	@RequestMapping("/updatedMilk")
	public String getUpdateMilkRate(HttpServletRequest req) {
		int hikeRate=Integer.parseInt(req.getParameter("hikeRate"));
		milkrateoperations =new MilkRateOperations();
		
	if(milkrateoperations.update(hikeRate)) {
			return "redirect:/updateMilkRate";
		}else {
			return "redirect:/updateMilkRate";

		}
		
		
	}
	
	@RequestMapping("/logout")
	public String getLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
}
