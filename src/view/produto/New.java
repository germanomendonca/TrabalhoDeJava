package view.produto;

import java.awt.FlowLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class New extends JDialog {
	private JPanel jpCodigo;
	private JLabel jlCodigo;
	private JTextField jtfCodigo;
	
	private JPanel jpDescricao;
	private JLabel jlDescricao;
	private JTextField jtfDescricao;
	
	private JButton jbSalvar;
	
	public New() {
		jpCodigo = new JPanel();
		jlCodigo = new JLabel("Código");
		jtfCodigo = new JTextField(10);
		
		jpCodigo.add(jlCodigo);
		jpCodigo.add(jtfCodigo);
		
		jpDescricao = new JPanel();
		jlDescricao = new JLabel("Descricao");
		jtfDescricao = new JTextField(20);
		
		jpDescricao.add(jlDescricao);
		jpDescricao.add(jtfDescricao);
		
		jbSalvar = new JButton("Salvar");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jpCodigo);
		getContentPane().add(jpDescricao);
		getContentPane().add(jbSalvar);
		
		setSize(500, 400);
	}
}
