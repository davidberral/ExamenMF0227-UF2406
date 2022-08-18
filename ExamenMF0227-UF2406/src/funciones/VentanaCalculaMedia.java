package funciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtUF2405;
	private JTextField txtUF2406;
	private JTextField txtUF2404;
	private Object Double media;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculaMedia() {
		setFont(new Font("Verdana", Font.PLAIN, 14));
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx right");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtNombre, "cell 2 1 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2404:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 2,alignx right");
		
		txtUF2404 = new JTextField();
		txtUF2404.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUF2404, "cell 2 2,growx");
		txtUF2404.setColumns(10);
		
		txtUF2405 = new JTextField();
		txtUF2405.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUF2405, "cell 4 2,growx");
		txtUF2405.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("UF2406:");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_1, "flowx,cell 5 2");
		
		txtUF2406 = new JTextField();
		txtUF2406.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtUF2406, "cell 6 2,growx");
		txtUF2406.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("UF2405:");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_2, "cell 3 2");
		
		JButton btnCalcularNota = new JButton("Calcular Nota");
		btnCalcularNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcularNota();
			}
		});
		btnCalcularNota.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnCalcularNota, "cell 2 4 5 1,alignx center");
		
		JLabel lblNewLabel_2 = new JLabel("Nota Media:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 1 6");
		
		JLabel lblNotaMedia = new JLabel("0.0");
		lblNotaMedia.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNotaMedia, "cell 2 6");
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 1 8");
		
		JLabel lblResultado = new JLabel("No calculado aún");
		lblResultado.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblResultado, "cell 2 8,alignx left");
	}

	protected void CalcularNota() {
		Double media=(txtUF2404+txtUF2405+txtUF2406)/3;
		
		
	}
	
		String nombre = txtNombre.getText(); 
		String uf2404 = Double.parseDouble(txtUF2404.getText()); 
		String uf2405 = Double.parseDouble(txtUF2405.getText());
		String uf2406 = Double.parseDouble(txtUF2406.getText());
}
