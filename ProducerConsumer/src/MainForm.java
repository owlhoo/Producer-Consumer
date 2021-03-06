import javax.swing.*;
import java.awt.*;

public class MainForm {
    private final JTextField[] producerTfs;
    private final JTextField[] bufferTfs;
    private final JTextField[] consumerTfs;
    public JPanel containerPnl;
    private Thread producerThread;
    private Thread consumerThread;
    private JTextField consumeTF0;
    private JTextField consumeTF1;
    private JTextField consumeTF2;
    private JTextField produceTF0;
    private JTextField produceTF1;
    private JTextField produceTF2;
    private JTextField produceTF3;
    private JTextField produceTF4;
    private JButton startBtn;
    private JTextField bufferTF0;
    private JTextField bufferTF1;
    private JTextField bufferTF2;
    private JTextField bufferTF3;
    private JTextField bufferTF4;
    private JTextField bufferTF5;
    private JTextField bufferTF6;
    private JButton pauseBtn;
    private JLabel consumerLbl;
    private JLabel prodLbl;
    private JLabel buffLbl;
    private JLabel controlsLbl;
    private JPanel controlsPnl;
    private JPanel controlsLblPnl;
    private JPanel controlsMainPnl;
    private JPanel buffLblPnl;
    private JPanel prodLblPnl;
    private JPanel consumeLblPnl;
    private JPanel bufPnl;
    private JPanel prodPnl;
    private JPanel consumePnl;
    private JPanel buffMainPnl;
    private JPanel prodMainPnl;
    private JPanel consumeMainPnl;

    public MainForm() {
        producerTfs = new JTextField[]{produceTF0, produceTF1, produceTF2, produceTF3, produceTF4};
        bufferTfs = new JTextField[]{bufferTF0, bufferTF1, bufferTF2, bufferTF3, bufferTF4, bufferTF5, bufferTF6};
        consumerTfs = new JTextField[]{consumeTF0, consumeTF1, consumeTF2};

        startBtn.addActionListener(e -> {
            startBtn.setEnabled(false);
            pauseBtn.setEnabled(true);

            if (producerThread.getState() == Thread.State.WAITING || consumerThread.getState() == Thread.State.WAITING) {
                producerThread.interrupt();
                consumerThread.interrupt();
                return;
            }

            producerThread.start();
            consumerThread.start();
        });

        pauseBtn.addActionListener(e -> {
            startBtn.setEnabled(true);
            pauseBtn.setEnabled(false);
            producerThread.interrupt();
            consumerThread.interrupt();
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        containerPnl = new JPanel();
        containerPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 1, new Insets(10, 10, 10, 10), -1, -1));
        containerPnl.setBackground(new Color(-4473925));
        containerPnl.setForeground(new Color(-14989637));
        consumeMainPnl = new JPanel();
        consumeMainPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        consumeMainPnl.setBackground(new Color(-4408132));
        Font consumeMainPnlFont = this.$$$getFont$$$("Noto Mono", Font.PLAIN, 16, consumeMainPnl.getFont());
        if (consumeMainPnlFont != null) consumeMainPnl.setFont(consumeMainPnlFont);
        consumeMainPnl.setForeground(new Color(-4408132));
        containerPnl.add(consumeMainPnl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        consumeLblPnl = new JPanel();
        consumeLblPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        consumeLblPnl.setBackground(new Color(-4408132));
        consumeLblPnl.setForeground(new Color(-4510425));
        consumeMainPnl.add(consumeLblPnl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        consumerLbl = new JLabel();
        consumerLbl.setBackground(new Color(-1));
        consumerLbl.setForeground(new Color(-12828863));
        consumerLbl.setText("Consumer");
        consumeLblPnl.add(consumerLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        consumePnl = new JPanel();
        consumePnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        consumePnl.setBackground(new Color(-4510425));
        consumePnl.setForeground(new Color(-4510425));
        consumeMainPnl.add(consumePnl, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        consumeTF0 = new JTextField();
        consumeTF0.setBackground(new Color(-4510425));
        consumeTF0.setDoubleBuffered(true);
        consumeTF0.setEditable(false);
        consumeTF0.setForeground(new Color(-1));
        consumeTF0.setHorizontalAlignment(0);
        consumeTF0.setText("-");
        consumePnl.add(consumeTF0, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        consumeTF2 = new JTextField();
        consumeTF2.setBackground(new Color(-4510425));
        consumeTF2.setDoubleBuffered(true);
        consumeTF2.setEditable(false);
        consumeTF2.setForeground(new Color(-1));
        consumeTF2.setHorizontalAlignment(0);
        consumeTF2.setText("-");
        consumePnl.add(consumeTF2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        consumeTF1 = new JTextField();
        consumeTF1.setBackground(new Color(-4510425));
        consumeTF1.setDoubleBuffered(true);
        consumeTF1.setEditable(false);
        consumeTF1.setForeground(new Color(-1));
        consumeTF1.setHorizontalAlignment(0);
        consumeTF1.setText("-");
        consumePnl.add(consumeTF1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        controlsMainPnl = new JPanel();
        controlsMainPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        controlsMainPnl.setBackground(new Color(-4408132));
        Font controlsMainPnlFont = this.$$$getFont$$$("Noto Mono", Font.PLAIN, 16, controlsMainPnl.getFont());
        if (controlsMainPnlFont != null) controlsMainPnl.setFont(controlsMainPnlFont);
        containerPnl.add(controlsMainPnl, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        controlsLblPnl = new JPanel();
        controlsLblPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        controlsLblPnl.setBackground(new Color(-4408132));
        controlsMainPnl.add(controlsLblPnl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        controlsLbl = new JLabel();
        controlsLbl.setForeground(new Color(-12828863));
        controlsLbl.setText("Controls");
        controlsLblPnl.add(controlsLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        controlsPnl = new JPanel();
        controlsPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        controlsPnl.setBackground(new Color(-4408132));
        controlsMainPnl.add(controlsPnl, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        startBtn = new JButton();
        startBtn.setBackground(new Color(-14141833));
        startBtn.setFocusPainted(false);
        startBtn.setFocusable(false);
        startBtn.setForeground(new Color(-1));
        startBtn.setMultiClickThreshhold(1L);
        startBtn.setText("Start");
        controlsPnl.add(startBtn, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pauseBtn = new JButton();
        pauseBtn.setBackground(new Color(-14141833));
        pauseBtn.setFocusPainted(false);
        pauseBtn.setFocusable(false);
        pauseBtn.setForeground(new Color(-1));
        pauseBtn.setMultiClickThreshhold(1L);
        pauseBtn.setText("Pause");
        controlsPnl.add(pauseBtn, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buffMainPnl = new JPanel();
        buffMainPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        buffMainPnl.setBackground(new Color(-4408132));
        Font buffMainPnlFont = this.$$$getFont$$$("Noto Mono", Font.PLAIN, 16, buffMainPnl.getFont());
        if (buffMainPnlFont != null) buffMainPnl.setFont(buffMainPnlFont);
        buffMainPnl.setForeground(new Color(-14828777));
        containerPnl.add(buffMainPnl, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        bufPnl = new JPanel();
        bufPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 7, new Insets(0, 0, 0, 0), -1, -1));
        bufPnl.setBackground(new Color(-16625989));
        bufPnl.setForeground(new Color(-14828777));
        buffMainPnl.add(bufPnl, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        bufferTF0 = new JTextField();
        bufferTF0.setBackground(new Color(-16625989));
        bufferTF0.setDoubleBuffered(true);
        bufferTF0.setEditable(false);
        bufferTF0.setForeground(new Color(-1));
        bufferTF0.setHorizontalAlignment(0);
        bufferTF0.setMargin(new Insets(2, 6, 2, 6));
        bufferTF0.setText("-");
        bufPnl.add(bufferTF0, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF2 = new JTextField();
        bufferTF2.setBackground(new Color(-16625989));
        bufferTF2.setDoubleBuffered(true);
        bufferTF2.setEditable(false);
        bufferTF2.setForeground(new Color(-1));
        bufferTF2.setHorizontalAlignment(0);
        bufferTF2.setMargin(new Insets(2, 6, 2, 6));
        bufferTF2.setText("-");
        bufPnl.add(bufferTF2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF4 = new JTextField();
        bufferTF4.setBackground(new Color(-16625989));
        bufferTF4.setDoubleBuffered(true);
        bufferTF4.setEditable(false);
        bufferTF4.setForeground(new Color(-1));
        bufferTF4.setHorizontalAlignment(0);
        bufferTF4.setMargin(new Insets(2, 6, 2, 6));
        bufferTF4.setText("-");
        bufPnl.add(bufferTF4, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF5 = new JTextField();
        bufferTF5.setBackground(new Color(-16625989));
        bufferTF5.setDoubleBuffered(true);
        bufferTF5.setEditable(false);
        bufferTF5.setForeground(new Color(-1));
        bufferTF5.setHorizontalAlignment(0);
        bufferTF5.setMargin(new Insets(2, 6, 2, 6));
        bufferTF5.setText("-");
        bufPnl.add(bufferTF5, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF6 = new JTextField();
        bufferTF6.setBackground(new Color(-16625989));
        bufferTF6.setDoubleBuffered(true);
        bufferTF6.setEditable(false);
        bufferTF6.setForeground(new Color(-1));
        bufferTF6.setHorizontalAlignment(0);
        bufferTF6.setMargin(new Insets(2, 6, 2, 6));
        bufferTF6.setText("-");
        bufPnl.add(bufferTF6, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF3 = new JTextField();
        bufferTF3.setBackground(new Color(-16625989));
        bufferTF3.setDoubleBuffered(true);
        bufferTF3.setEditable(false);
        bufferTF3.setForeground(new Color(-1));
        bufferTF3.setHorizontalAlignment(0);
        bufferTF3.setMargin(new Insets(2, 6, 2, 6));
        bufferTF3.setText("-");
        bufPnl.add(bufferTF3, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        bufferTF1 = new JTextField();
        bufferTF1.setBackground(new Color(-16625989));
        bufferTF1.setDoubleBuffered(true);
        bufferTF1.setEditable(false);
        bufferTF1.setForeground(new Color(-1));
        bufferTF1.setHorizontalAlignment(0);
        bufferTF1.setMargin(new Insets(2, 6, 2, 6));
        bufferTF1.setText("-");
        bufPnl.add(bufferTF1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        buffLblPnl = new JPanel();
        buffLblPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        buffLblPnl.setBackground(new Color(-4408132));
        buffLblPnl.setForeground(new Color(-14828777));
        buffMainPnl.add(buffLblPnl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        buffLbl = new JLabel();
        buffLbl.setBackground(new Color(-4492238));
        buffLbl.setForeground(new Color(-12828863));
        buffLbl.setText("Buffer");
        buffLblPnl.add(buffLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        prodMainPnl = new JPanel();
        prodMainPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(10, 10, 10, 10), -1, -1));
        prodMainPnl.setBackground(new Color(-4408132));
        Font prodMainPnlFont = this.$$$getFont$$$("Noto Mono", Font.PLAIN, 16, prodMainPnl.getFont());
        if (prodMainPnlFont != null) prodMainPnl.setFont(prodMainPnlFont);
        containerPnl.add(prodMainPnl, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        prodPnl = new JPanel();
        prodPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        prodPnl.setBackground(new Color(-16301798));
        prodMainPnl.add(prodPnl, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        produceTF0 = new JTextField();
        produceTF0.setBackground(new Color(-16301822));
        produceTF0.setDoubleBuffered(true);
        produceTF0.setEditable(false);
        produceTF0.setForeground(new Color(-1));
        produceTF0.setHorizontalAlignment(0);
        produceTF0.setText("-");
        prodPnl.add(produceTF0, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        produceTF2 = new JTextField();
        produceTF2.setBackground(new Color(-16301822));
        produceTF2.setDoubleBuffered(true);
        produceTF2.setEditable(false);
        produceTF2.setForeground(new Color(-1));
        produceTF2.setHorizontalAlignment(0);
        produceTF2.setText("-");
        prodPnl.add(produceTF2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        produceTF4 = new JTextField();
        produceTF4.setBackground(new Color(-16301822));
        produceTF4.setDoubleBuffered(true);
        produceTF4.setEditable(false);
        produceTF4.setForeground(new Color(-1));
        produceTF4.setHorizontalAlignment(0);
        produceTF4.setText("-");
        prodPnl.add(produceTF4, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        produceTF1 = new JTextField();
        produceTF1.setBackground(new Color(-16301822));
        produceTF1.setDoubleBuffered(true);
        produceTF1.setEditable(false);
        produceTF1.setForeground(new Color(-1));
        produceTF1.setHorizontalAlignment(0);
        produceTF1.setText("-");
        prodPnl.add(produceTF1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        produceTF3 = new JTextField();
        produceTF3.setBackground(new Color(-16301822));
        produceTF3.setDoubleBuffered(true);
        produceTF3.setEditable(false);
        produceTF3.setForeground(new Color(-1));
        produceTF3.setHorizontalAlignment(0);
        produceTF3.setText("-");
        prodPnl.add(produceTF3, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, 60), new Dimension(60, 60), new Dimension(60, 60), 0, false));
        prodLblPnl = new JPanel();
        prodLblPnl.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        prodLblPnl.setBackground(new Color(-4408132));
        prodMainPnl.add(prodLblPnl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        prodLbl = new JLabel();
        prodLbl.setForeground(new Color(-12828863));
        prodLbl.setText("Producer");
        prodLblPnl.add(prodLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return containerPnl;
    }

    /**
     * @noinspection ALL
     */
//    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
//        if (currentFont == null) return null;
//        String resultName;
//        if (fontName == null) {
//            resultName = currentFont.getName();
//        } else {
//            Font testFont = new Font(fontName, Font.PLAIN, 10);
//            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
//                resultName = fontName;
//            } else {
//                resultName = currentFont.getName();
//            }
//        }
//        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
//    }

    public void setProducerThread(Thread producerThread) {
        this.producerThread = producerThread;
    }

    public void setConsumerThread(Thread consumerThread) {
        this.consumerThread = consumerThread;
    }

    public void setProducerValue(Integer index, Object value) {
        producerTfs[index].setText(value.toString());
    }

    public void setConsumerValue(Integer index, Object value) {
        consumerTfs[index].setText(value.toString());
    }

    public void setBufferValue(Integer index, Object value) {
        bufferTfs[index].setText(value.toString());
    }

    public void removeProducerValue(Integer index) {
        producerTfs[index].setText("-");
    }

    public void removeConsumerValue(Integer index) {
        consumerTfs[index].setText("-");
    }

    public void removeBufferValue(Integer index) {
        bufferTfs[index].setText("-");
    }

    public void resetConsumerValues() {
        for (int i = 0; i < 3; i++) {
            removeConsumerValue(i);
        }
    }

    public void resetProducerValues() {
        for (int i = 0; i < 3; i++) {
            removeProducerValue(i);
        }
    }
}
