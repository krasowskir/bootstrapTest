package com.example.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TabellenController {

    @RequestMapping("/tabellen")
    public String showTabelle() {
	return "tabelle";
    }

    @RequestMapping("/neueSeite")
    public String showNeueSeite() {
	return "neueSeite";
    }

    @RequestMapping("/contact")
    public String showContact() {
	return "contact";
    }

    @RequestMapping("/form")
    public String showForm() {
	return "formulare";
    }

    @RequestMapping("/modals")
    public String showModals() {
	return "modals";
    }

    @RequestMapping("/selectors")
    public String showSelectors() {
	return "selectors";
    }

    @RequestMapping("/myForm")
    public String showMyForm() {
	return "myForm";
    }

    @RequestMapping(value = "/myFormAbgegeben", method = RequestMethod.GET)
    public String populateMyForm(HttpServletRequest req, HttpServletResponse resp) {
	System.out.println("Parameter: " + req.getParameter("fuckYou"));
	System.out.println("Passwort: " + req.getParameter("meinPasswort"));
	System.out.println("radio: " + req.getParameter("meinRadio"));
	System.out.println("meineSelectBox: " + req.getParameter("meineSelectBox"));
	Enumeration<String> headers = req.getHeaderNames();
	System.out.println("========");
	while (headers.hasMoreElements()) {
	    String header = headers.nextElement();
	    System.out.println(header + req.getHeader(header));
	}

	// resp.setHeader("Locationmeine", "/selectors"); // geht nicht!
	// resp.setHeader("Location", "/selectors");
	// resp.setStatus(302);
	return "myForm";
    }

    @RequestMapping("/myBlocks")
    public String showMyBlockElements() {
	return "myBlockElements";
    }

    @RequestMapping("/myAnimations")
    public String showAnimations() {
	return "animations";
    }

    @RequestMapping("/cssLecture")
    public String showCssLecture() {
	return "cssLecture";
    }

    @RequestMapping("/boxes")
    public String showBoxes() {
	return "boxes";
    }

    @RequestMapping("/myTable")
    public String showMyTable() {
	return "myCssTable";
    }

    @RequestMapping("/images")
    public String showImages() {
	return "images";
    }
}
