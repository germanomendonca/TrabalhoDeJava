package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

import controller.ProdutosController;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private static MainFrame instance;
	private JMenuBar menuBar;
	private JMenu jmCadastro;
	private JMenuItem jmiCadastroProduto;
	
	private MainFrame() {
		menuBar = new JMenuBar();
		jmCadastro = new JMenu("Cadastro");
		jmiCadastroProduto = new JMenuItem("Produto");
		
		jmiCadastroProduto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ProdutosController.newResource(new HashMap());
			}
			
		});
		
		jmCadastro.add(jmiCadastroProduto);
		menuBar.add(jmCadastro);
		setJMenuBar(menuBar);
		
		setSize(500, 400);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	
	public static void main(String[] args) {
		MainFrame mf = MainFrame.getInstance();
		mf.setVisible(true);
	}
	
	public static MainFrame getInstance() {
		if(instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}
}
