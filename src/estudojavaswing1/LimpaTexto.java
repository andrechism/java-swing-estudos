package estudojavaswing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LimpaTexto {
    
    public void JanelaSimples(){
        final JButton btnLimpa = new JButton("Limpa"); //botão
        final JTextField tfTexto = new JTextField(10); //Campo de texto
        tfTexto.setText("Java");
        final JFrame janela = new JFrame ("Janela Simples"); //Janela
        janela.setSize(500, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        
        JPanel painel = new JPanel();
        painel.add(btnLimpa);
        painel.add(tfTexto);
        janela.getContentPane().add(painel);
        
        JLabel label1 = new JLabel("Label1: Apenas Texto"); //Cria label com texto
        painel.add(label1);
        JLabel label2 = new JLabel("Label2: Imagem e Texto", new ImageIcon("images/Capturar.gif"), JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        painel.add(label2);
        
        
        JButton botao1 = new JButton("Botão Desabilitado");
        botao1.setEnabled(false);
        botao1.setToolTipText("Exemplo de um botão de texto");
        botao1.setMnemonic(KeyEvent.VK_D); //Alt-D
        painel.add(botao1);
        
        JButton botao2 = new JButton("Botão Habilitado", new ImageIcon("images/Capturar.gif"));
        botao2.setToolTipText("Botão de texto e imagem");
        botao2.setMnemonic(KeyEvent.VK_H); //Alt-H
        botao2.setPressedIcon(new ImageIcon("images/Capturar2.gif"));
        painel.add(botao2);
        
        /*       logica        */
        btnLimpa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfTexto.setText("");
            }
        });
        /*      fimLogica      */
        
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        LimpaTexto main = new LimpaTexto();
        main.JanelaSimples();
    }
    
}
