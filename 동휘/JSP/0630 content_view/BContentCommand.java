package edu.bit.ex.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.command.BCommand;
import edu.bit.ex.dao.BDao;
import edu.bit.ex.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);
	}

}
