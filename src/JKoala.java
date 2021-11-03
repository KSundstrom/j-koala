import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class JKoala extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton alphaButton;
	private JButton bravoOneButton;
	private JButton bravoTwoButton;
	private static final String WIN_TITLE = "JKoala LSM2015";
	private static final int WIN_WIDTH = 450;
	private static final int WIN_HEIGHT = 75;

	private JKoala() {
		setTitle(WIN_TITLE);
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		getContentPane().add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(final String[] args) {
		@SuppressWarnings("unused")
		JKoala koalaWindow = new JKoala();
	}

	private final void buildPanel() {
		alphaButton = new JButton("Avdelning A");
		alphaButton.addActionListener(new AlphaButtonListener());
		bravoOneButton = new JButton("Avdelning B: Lättare");
		bravoOneButton.addActionListener(new BravoOneButtonListener());
		bravoTwoButton = new JButton("Avdelning B: Svårare");
		bravoTwoButton.addActionListener(new BravoTwoButtonListener());
		panel = new JPanel();
		panel.add(alphaButton);
		panel.add(bravoOneButton);
		panel.add(bravoTwoButton);
	}

	private final class AlphaButtonListener implements ActionListener {
		@Override
		public final void actionPerformed(ActionEvent event) {
			String[] songs = new String[15];

			songs[0] = "Pacius/Runeberg: Vårt land, första och sista versen\nUtantill\n(MM250 nr 1)";
			songs[1] = "Sibelius/Koskenniemi/Rundt: Finlandia-hymni/Finlandia-hymnen, finska och svenska\nUtantill\n(MM250 nr 2)";
			songs[2] = "Pacius/von Qvanten/Hahl: Suomis sång/Suomen laulu, I och IV versen, svenska och finska\nUtantill\n(MM250 nr 3)";
			songs[3] = "Frieberg/Frieberg: Sångarfanan\nUtantill\n(MM250 nr 14)";
			songs[4] = "Prins Gustaf/Sätherberg: Studentsång (Sjungom studentens…), första versen\nUtantill\n(MM250 nr 18)";
			songs[5] = "de la Halle/Schreiber/anon/Ralf: Madrigal (Kom du ljuva…), första och sista versen\nUtantill\n(MM250 nr 143)";
			songs[6] = "Abt/anon: Serenad (Ljuva flicka…)\nUtantill\n(MM250 nr 147)";
			songs[7] = "anon/Berwald/Bergman/anon: Helan går\nUtantill\n(MM250 nr 153)";
			songs[8] = "Wennerberg/Nyblom: Halvan (Hur länge…) [orig. Stridsrop (Hur länge skall i Norden…)]\nUtantill\n(MM250 nr 154)";
			songs[9] = "Fougstedt/Fougstedt: Tersen (Re’n helan…)\nUtantill\n(MM250 nr 155)";
			songs[10] = "Thomsén/Seedorf: Aquaviten (Ren som en jomfru…)\nUtantill\n(MM250 nr 156)";
			songs[11] = "Marschner/von Kobell: Das Königslied (Ein König ist der Wein…)\nUtantill\n(MM250 nr 159)";
			songs[12] = "Hermes/anon: Metsämiehen juomalaulu (Käy metsolan…)\nUtantill\n(MM250 nr 164)";
			songs[13] = "Bellman/Donner/Bellman: Fredmans epistel nr 81 (Märk hur’ vår skugga…), första och sista versen\nUtantill\n(MM250 nr 186)";
			songs[14] = "Bellman/Ahström/anon: Var redo [orig. Fredmans sång nr 27 (Ur vägen, ur vägen…)]\nUtantill\n(MM250 nr 190)";

			Random rand = new Random();
			String song = songs[rand.nextInt(songs.length)];
			JOptionPane.showMessageDialog(null, song);
		}
	}

	private final class BravoOneButtonListener implements ActionListener {
		@Override
		public final void actionPerformed(ActionEvent event) {
			String[] songs = new String[25];

			songs[0] = "trad/Klemetti/Klemetti: Oi kallis Suomenmaa\nNoter\nMM250 nr 6";
			songs[1] = "Hagfors/Hagfors: Modersmålets sång\nUtantill\n(MM250 nr 9)";
			songs[2] = "Grieg/Skavlan: Sangerhilsen\nUtantill\n(MM250 nr 12)";
			songs[3] = "Feuk/Cronhamn/Feuk: Jägarsång (Bröder, hörden I signalen?…)\nUtantill\n(MM250 nr 19)";
			songs[4] = "Stunz/Weismann: Studentsång (Dåne liksom åskan…)\nNoter\nMM250 nr 21";
			songs[5] = "Sibelius/Reuter: Till havs, första och sista versen\nNoter\nMM250 nr 43";
			songs[6] = "trad/Pesonen/trad: Poijat kun raitilla laulelivat\nUtantill\n(MM250 nr 71)";
			songs[7] = "Möller/Bååth: Island (Vilar i vita…)\nUtantill\n(MM250 nr 98)";
			songs[8] = "Marschner/anon: Gute Nacht (Warum bist du so ferne…)\nNoter\nMM250 nr 141";
			songs[9] = "trad/Tullberg/trad: Kristallen\nUtantill\n(MM250 nr 142)";
			songs[10] = "Adam/Herwegh: Champagnerlied (Wir griffen jüngst…)\nUtantill\n(MM250 nr 158)";
			songs[11] = "Bellman/Kjerulf/Bellman: Bacchi ordenskapitel VII nr 10 (Klinga nu med klarinetter…)\nNoter\nMM250 nr 184";
			songs[12] = "Bellman/Pacius/Bellman: Fredmans epistel nr 13 (Nå ä’ nu alla…), första versen\nNoter\nMM250 nr 187";
			songs[13] = "Bellman/Moring/Bellman: Fredmans epistel nr 82 (Vila vid denna källa…), första versen\nUtantill\n(MM250 nr 192)";
			songs[14] = "Lindblad/Sätherberg: Längtan till landet (Vintern rasat…)\nUtantill\n(MM250 nr 193)";
			songs[15] = "Kuhlau/Voss/Böttiger: Majsång (O hur härligt…)\nUtantill\n(MM250 nr 194)";
			songs[16] = "Prins Gustaf/Sätherberg: Vårsång (Glad såsom fågeln…)\nUtantill\n(MM250 nr 195)";
			songs[17] = "Sibelius/Karlfeldt: Fridolins dårskap (Knappt leker mört…)\nUtantill\n(MM250 nr 196)";
			songs[18] = "Ehrström/Moring/Runeberg: Källan\nUtantill\n(MM250 nr 206)";
			songs[19] = "trad/Alfvén/trad: Uti vår hage\nNoter\nMM250 nr 211";
			songs[20] = "Nordqvist/Evers: Jul, jul, strålande jul\nUtantill\n(MM250 nr 220)";
			songs[21] = "Härtel/anon: Sua tervehdin [orig. Abendständchen (Ich grüße dich…)]\nUtantill\n(MM250 nr 234)";
			songs[22] = "Pfeil/Pfeil/anon: Lugn vilar sjön\nNoter\nMM250 nr 246";
			songs[23] = "Flemming/Flacchus: Ode (Integer vitae…)\nNoter\nMM250 nr 249";
			songs[24] = "trad/Hall/trad: My Evaline\nNoter\nLösblad";

			Random rand = new Random();
			String song = songs[rand.nextInt(songs.length)];
			JOptionPane.showMessageDialog(null, song);
		}
	}

	private final class BravoTwoButtonListener implements ActionListener {
		@Override
		public final void actionPerformed(ActionEvent event) {
			String[] songs = new String[13];

			songs[0] = "Cronhamn/anon: Studentsång (Bröder! o slutom förbund…)\nNoter\nMM250 nr 20";
			songs[1] = "Bergman/Snoilsky: Gammalt porslin (En kung i Sachsen…)\nNoter\nMM250 nr 30";
			songs[2] = "Madetoja/Leino: Soita, somer, helkä hiekka…\nNoter\nMM250 nr 74";
			songs[3] = "Sibelius/Kivi: Sydämeni laulu (Tuonen lehto…)\nNoter\nMM250 nr 77";
			songs[4] = "Witt/anon: Nur im Herzen\nNoter\nMM250 nr 145";
			songs[5] = "trad/Svedbom/trad: Hej dunkom\nUtantill\n(MM250 nr 161)";
			songs[6] = "trad/Fougstedt/trad: Heppeneppetepp\nUtantill\n(MM250 nr 162)";
			songs[7] = "Pacius/Müller: Trinklied (Guckt nicht…)\nNoter\nMM250 nr 175";
			songs[8] = "trad/Westerlund/anon: Tuborg\nNoter\nMM250 nr 176";
			songs[9] = "Düring/Gleim/anon: Ack om jag vore kejsare\nNoter\nMM250 nr 198";
			songs[10] = "trad/Rosas/Reuter: Morgonvisa (Morgonen ljusnar…)\nUtantill\n(MM250 nr 207)";
			songs[11] = "Sibelius/Fougstedt/Runeberg: Ej med klagan\nUtantill\n(MM250 nr 245)";
			songs[12] = "trad/The Mainstreeters/trad: Coney Island Baby\nNoter\nLösblad";

			Random rand = new Random();
			String song = songs[rand.nextInt(songs.length)];
			JOptionPane.showMessageDialog(null, song);
		}
	}
}
