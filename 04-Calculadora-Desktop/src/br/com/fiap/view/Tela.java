package br.com.fiap.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.rmi.RemoteException;

import javax.rmi.CORBA.Stub;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import br.com.fiap.ws.bo.FiapBOStub;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMedia;
import br.com.fiap.ws.bo.FiapBOStub.CalcularMediaResponse;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Tela {

	protected Shell shell;
	private Text txtNac;
	private Text txtPs;
	private Text txtAm;
	private Text txtResultado;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 452);
		shell.setText("SWT Application");
		
		Label lblNac = new Label(shell, SWT.NONE);
		lblNac.setBounds(58, 66, 55, 15);
		lblNac.setText("NAC");
		
		Label lblPs = new Label(shell, SWT.NONE);
		lblPs.setBounds(58, 102, 55, 15);
		lblPs.setText("PS");
		
		Label lblAm = new Label(shell, SWT.NONE);
		lblAm.setBounds(58, 140, 55, 15);
		lblAm.setText("AM");
		
		txtNac = new Text(shell, SWT.BORDER);
		txtNac.setBounds(119, 60, 76, 21);
		
		txtPs = new Text(shell, SWT.BORDER);
		txtPs.setText("");
		txtPs.setBounds(119, 96, 76, 21);
		
		txtAm = new Text(shell, SWT.BORDER);
		txtAm.setText("");
		txtAm.setBounds(119, 134, 76, 21);
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Clique do botão
				float nac = Float.parseFloat(txtNac.getText());
				float am = Float.parseFloat(txtAm.getText());
				float ps = Float.parseFloat(txtPs.getText());
				
				try {
					FiapBOStub stub = new FiapBOStub();
					
					CalcularMedia valores = new CalcularMedia();
					valores.setNac(am);
					valores.setNac(nac);
					valores.setPs(ps);
				
					CalcularMediaResponse resposta = stub.calcularMedia(valores);
					
					txtResultado.setText(String.valueOf(resposta.get_return()));
				} catch (Exception ex) {
					
					ex.printStackTrace();
				} 
			}
		});
		btnCalcular.setBounds(120, 196, 75, 25);
		btnCalcular.setText("Calcular");
		
		txtResultado = new Text(shell, SWT.BORDER);
		txtResultado.setEditable(false);
		txtResultado.setBounds(119, 246, 76, 21);

	}
}
