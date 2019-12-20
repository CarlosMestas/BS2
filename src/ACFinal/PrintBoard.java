package ACFinal;

import ACFinal.Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PrintBoard extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JLabel[][] b;
    public Game game;
    private JPanel panelSuperior,panelInferior,central,panelIzquierdo, panelDerecho;
    private Adapter adapter;
    private JPanel Player1,Player2;
    private JPanel info;
    public JTextField jugada;
    
    public PrintBoard(Game game) {
        this.game=game;
        this.adapter = new Adapter();
		setTitle(this.game.getBoard().getGameName());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new  BorderLayout());
    
        central= new JPanel();
        panelSuperior= new JPanel();
        panelInferior= new JPanel();
        panelIzquierdo= new JPanel();
        panelDerecho=new JPanel();
        
        contents();
        add(central,BorderLayout.CENTER);
        add(panelSuperior,BorderLayout.PAGE_START);
        add(panelInferior,BorderLayout.PAGE_END);
        add(panelIzquierdo,BorderLayout.LINE_START);
        add(panelDerecho, BorderLayout.LINE_END);
        setSize(500,500);
        game.iniciarJugadores();
        setVisible(true);
    }

    public void contents() {
        contentsThreeInLine(this.game.getBoard());
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(new JLabel("MI GAME"));
        panelInferior.setLayout( new FlowLayout(FlowLayout.CENTER));
        panelInferior.add(new JLabel("MI GAME"));
        panelIzquierdo.setLayout(new FlowLayout());
        jugada=new JTextField(10);
        jugada.setSize(200,200);
        
        panelSuperior.add(jugada);
        panelDerecho.setLayout(new FlowLayout());
        JButton envio= new JButton("Enviar jugada");
        envio.setSize(200,200);
        envio.addActionListener(this);
        panelSuperior.add(envio);
    }
    
    public void contentsThreeInLine(Board board){
        central.setLayout(new GridLayout(5,5));
        b =new JLabel[board.getRows()][board.getRows()];
        b[0][0]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[0][0]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[0][1]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[0][1]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[0][2]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[0][2]);

        //--------------------------
        for(int i=0;i<5;i++){
            central.add(new JLabel(new ImageIcon("image\\black.png")));
        }
        //--------------------------
    
        b[1][0]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[1][0]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[1][1]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[1][1]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[1][2]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[1][2]);
    
        //-----------------
        for(int i=0;i<5;i++){
            central.add(new JLabel(new ImageIcon("image\\hori.png")));
        }
        //-----------------
    
        b[2][0]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[2][0]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[2][1]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[2][1]);
        central.add(new JLabel(new ImageIcon("image\\black.png")));
        b[2][2]=new JLabel(new ImageIcon("image\\blanco.png"));
        central.add(b[2][2]);
    }
    
    public void actionPerformed(ActionEvent e) {
            JButton n=(JButton)e.getSource();
            String jugado =jugada.getText(); 
            if(jugado.length()==0 ){
                JOptionPane.showMessageDialog(null, "jugada incorrecta jugada");
            }else{
                Player jug= game.getPlayerturn();
                int []verifica= adapter.AdapterJugada(jugado);
                if(game.getBoard().getBox(verifica[0], verifica[1])==null){
                int [] jugadass = game.jugada(jug,jugado);
                    ImageIcon fot = new ImageIcon("image\\"+jug.getSymbol()+".png");
                    Icon icono = new ImageIcon(fot.getImage().getScaledInstance(b[jugadass[0]][jugadass[1]].getWidth(), b[jugadass[0]][jugadass[1]].getHeight(), Image.SCALE_DEFAULT));
                    b[jugadass[0]][jugadass[1]].setIcon(icono);
                    game.getPlayerMoved();
                    this.jugada.setText("");
                    if(game.isFinished(jug)){
                        JOptionPane.showMessageDialog(null, "Ganaste "+jug.getName());
                        setVisible(false);
                    }
                    if(game.isTied()){
                        JOptionPane.showMessageDialog(null, "Empate GG");
                        setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Posicion Ocupada");
                    
                }

            }
        }
    public void EditSize(){
        Player1.setSize(200,200);
        Player2.setSize(200,200);
        info.setSize(50,200);
        //--------
        central.setSize(550,200);
        //--------
        panelDerecho.setSize(50,200);
        panelIzquierdo.setSize(50,200);
        //--------
        panelSuperior.setSize(500, 100);
        panelInferior.setSize(500, 10);
        //--------
        setSize(500, 300);
        setResizable(false);
    }
}