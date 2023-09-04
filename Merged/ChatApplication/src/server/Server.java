package server;

public class Server 
{
	private jFrame serverframe;
	private jTextArea ta;
	private JScrollPane scrollpan;
	private JTextFieldtf;
	
	
	server(){
		serverframe=new JFrame();
		serverframe.detDefaultCloseperation(JFrame.EXI_ON_CLOSE);
		
		ta=new JTextArea();
		ta.setEditable(false);
		scrollpane = new JSrllPane(ta);
		Serverframe.add(scrollpane);
		
		
		tf=new JTextField();
		serverframe.add(tf,BorderLayout.SOUTH);
		
		serverframe.seVisible(true);
	}
	public void waitingForClient() {
		
	}
}
