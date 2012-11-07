package controller;

import java.util.Map;

import javax.swing.JDialog;

public class ProdutosController {
	
	public static void newResource(Map<String, String> params) {
		JDialog view = new view.produto.New();
		view.setVisible(true);
	}
	
	public static void edit() {}
	
	public static void create() {}
	
	public static void update() {}
	
	public static void destroy() {}
}
