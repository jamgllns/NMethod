package nmethod;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.CYAN;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class main extends javax.swing.JFrame {
    public main() {
        initComponents();
    }
   private double valL = Double.NEGATIVE_INFINITY; // Initialize xL and xU as global variables
   private double valU = Double.POSITIVE_INFINITY;
   private int totalIterCount = 1; // Initialize total iteration count as global variable
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        graph = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        root = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        equation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        xL = new javax.swing.JTextField();
        editedLabel = new javax.swing.JLabel();
        xU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Selection = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 221, 191));
        jPanel1.setMaximumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setMinimumSize(new java.awt.Dimension(1044, 824));
        jPanel1.setPreferredSize(new java.awt.Dimension(1044, 857));
        jPanel1.setLayout(null);

        graph.setBackground(new java.awt.Color(255, 255, 255));
        graph.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout graphLayout = new javax.swing.GroupLayout(graph);
        graph.setLayout(graphLayout);
        graphLayout.setHorizontalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        graphLayout.setVerticalGroup(
            graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        jPanel1.add(graph);
        graph.setBounds(420, 120, 580, 350);

        tbl.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xR)", "f(xU)", "Error"
            }
        ));
        tbl.setEnabled(false);
        tbl.setFocusable(false);
        tbl.getTableHeader().setResizingAllowed(false);
        tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 490, 980, 330);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(103, 149, 142));
        jPanel4.setLayout(null);

        jButton1.setBackground(new java.awt.Color(59, 103, 96));
        jButton1.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(170, 230, 140, 40);

        jLabel1.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOT:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 290, 140, 40);

        root.setBackground(new java.awt.Color(59, 103, 96));
        root.setFont(new java.awt.Font("Txt_IV50", 1, 14)); // NOI18N
        root.setForeground(new java.awt.Color(255, 255, 255));
        root.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.add(root);
        root.setBounds(150, 290, 180, 40);

        jLabel2.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EQUATION:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 110, 120, 40);

        equation.setBackground(new java.awt.Color(59, 103, 96));
        equation.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        equation.setForeground(new java.awt.Color(255, 255, 255));
        equation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.add(equation);
        equation.setBounds(140, 110, 200, 40);

        jLabel3.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("xL:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(60, 170, 60, 40);

        xL.setBackground(new java.awt.Color(59, 103, 96));
        xL.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        xL.setForeground(new java.awt.Color(255, 255, 255));
        xL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.add(xL);
        xL.setBounds(120, 170, 70, 40);

        editedLabel.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        editedLabel.setForeground(new java.awt.Color(255, 255, 255));
        editedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editedLabel.setText("----");
        jPanel4.add(editedLabel);
        editedLabel.setBounds(210, 170, 60, 40);

        xU.setBackground(new java.awt.Color(59, 103, 96));
        xU.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        xU.setForeground(new java.awt.Color(255, 255, 255));
        xU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.add(xU);
        xU.setBounds(270, 170, 80, 40);

        jLabel4.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select Method:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 30, 140, 40);

        Selection.setBackground(new java.awt.Color(59, 103, 96));
        Selection.setFont(new java.awt.Font("Txt_IV50", 0, 14)); // NOI18N
        Selection.setForeground(new java.awt.Color(255, 255, 255));
        Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "GRAPHICAL", "INCREMENTAL", "BISECTION", "FALSE POSITION", "SIMPLE FIXED-POINT", "NEWTON-RAPHSON", "SECANT " }));
        Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionActionPerformed(evt);
            }
        });
        jPanel4.add(Selection);
        Selection.setBounds(160, 30, 160, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 370, 350);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 110, 980, 370);

        jPanel2.setBackground(new java.awt.Color(103, 149, 142));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Txt_IV50", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NUMERICAL METHODS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 10, 660, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1050, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if (Selection.getSelectedIndex()== 0){
                JOptionPane.showMessageDialog(null, "Please select a method!");
            }else if (Selection.getSelectedIndex() == 1) {
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            String eqStr = equation.getText().replaceAll("\\s", "");
            double valX = Double.parseDouble(xL.getText());
            DecimalFormat format = new DecimalFormat("#.####");

            ArrayList<Object[]> dataList = new ArrayList<>();

            double prevY = evaluateFunc(eqStr, valX);
            String decX = format.format(valX);
            String decY = format.format(prevY);
            dataList.add(new Object[]{decX, decY});

            double step = 0.2;
            double currX = valX + step;
            double currY = evaluateFunc(eqStr, currX);
            boolean signChange = false;

            double rootVal = Double.NaN;

            try {

                while (!signChange) {
                    decX = format.format(currX);
                    decY = format.format(currY);
                    dataList.add(new Object[]{decX, decY});
                    model.setRowCount(0);

                    for (Object[] row : dataList) {
                        model.addRow(row);
                    }

                    if (prevY * currY < 0) {
                        double tolerance = 0.0001;
                        double roots = 0;
                        double lowerBound = currX - step;
                        double upperBound = currX;

                        do {
                            roots = (upperBound * evaluateFunc(eqStr, upperBound) - upperBound * evaluateFunc(eqStr, lowerBound))
                            / (evaluateFunc(eqStr, upperBound) - evaluateFunc(eqStr, lowerBound));

                            double fA = evaluateFunc(eqStr, lowerBound);
                            double fC = evaluateFunc(eqStr, roots);

                            if (fC == 0.0) {
                                break;
                            } else if (fA * fC < 0) {
                                lowerBound = roots;
                            } else {
                                upperBound = roots;
                            }
                        } while (Math.abs(upperBound - lowerBound) > tolerance);
                        
                        
                        rootVal = roots;
                        root.setText(format.format(rootVal));

                        signChange = true; // Set signChange to true to exit the loop

                        graph(equation.getText(), roots);
                    } else {
                        prevY = currY;
                        currX += step;
                        currY = evaluateFunc(eqStr, currX);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            //Incremental Method
        } else if (Selection.getSelectedIndex() == 2){
            try {
                if (equation.getText().isEmpty() || xL.getText().isEmpty() || xU.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    DecimalFormat format = new DecimalFormat("#.########");
                    ArrayList<Object[]> dataList = new ArrayList<>();
                    double marginE = 0.0001;
                    double valL = Double.parseDouble(xL.getText());
                    double delta = Double.parseDouble(xU.getText());
                    double roots = 0;
                    double valU = valL + delta;
                    int iterCount = 0;
                    double prevU = 0;
                    int previousRowIndex = -1;
                    int lastRowIndex = -1;

                    double error = Math.abs(valU - prevU) / Math.abs(valU) * 100;

                    while (error > marginE) {
                        iterCount++;
                        double fL = evaluateFunc(equation.getText(), valL);
                        double fU = evaluateFunc(equation.getText(), valU);
                        double product = fL * fU;

                        String decA = format.format(valL);
                        String decC = format.format(delta);
                        String decB = format.format(valU);
                        String decFA = format.format(fL);
                        String decFB = format.format(fU);
                        String decError;

                        if (iterCount == 1) {
                            decError = " ";
                        } else {
                            double currentError = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                            decError = format.format(currentError);
                        }

                        String sign;
                        if (product < 0) {
                            sign = "<0";
                        } else if (product > 0) {
                            sign = ">0";
                        } else {
                            sign = "0"; // Just in case the product is zero
                        }

                        Object[] rowData = {iterCount, decA, decC,
                            decB, decFA, decFB, decError, sign};
                        dataList.add(rowData);

                        if (error < marginE && fL * fU == 0) {
                            roots = valU;
                            break;
                        }

                        if (fL * fU < 0) {
                            valL = valL;
                            delta /= 10.0;
                            roots = valU;
                        } else if (fL * fU > 0){
                            valL = valU;
                            delta = delta;
                            roots = valU;
                        }

                        prevU = valU;
                        valU = valL + delta;
                        error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                    }
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : dataList) {
                        model.addRow(row);
                    }
      
                   // Store the current row index before updating the interval
                   previousRowIndex = model.getRowCount() - 1;
                   lastRowIndex = previousRowIndex;
                   
   
                    if (roots != 0) {
                        String decRoot = format.format(roots);
                        root.setText(decRoot);
                        graph(equation.getText(), roots);
                    } else {
                        JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            //Bisection Method
        } else if (Selection.getSelectedIndex() == 3){
            try {
                   
                if (equation.getText().isEmpty() || xL.getText().isEmpty() || xU.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    DecimalFormat format = new DecimalFormat("#.####");
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.0001;
                    double xl = Double.parseDouble(xL.getText());
                    double xu = Double.parseDouble(xU.getText());
                    double roott = 0;
                    double xM = (xl + xu) / 2.0;
                    int iterations = 0;
                    double prevXM = 0;
                    
                    
                    
                    double Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100;

                    while (Error > MarginE) {
                        iterations++;
                        double fxL = evaluateFunc(equation.getText(), xl);
                        double fxU = evaluateFunc(equation.getText(), xM);
                        double fxM = evaluateFunc(equation.getText(), xu);

                        String decimalnumA = format.format(xl);
                        String decimalnumB = format.format(xu);
                        String decimalnumC = format.format(xM);
                        String decimalnumFA = format.format(fxL);
                        String decimalnumbFC = format.format(fxU);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = " ";
                        } else {
                            double currentError = Math.abs(xM - prevXM) / Math.abs(xM) * 100;
                            decimalnumERROR = format.format(currentError);
                        }

                        Object[] rowData = {iterations, decimalnumA, decimalnumC,
                            decimalnumB, decimalnumFA, decimalnumbFC, decimalnumERROR};
                        data.add(rowData);

                        if (Math.abs(fxM) < MarginE) {
                            roott = xM;
                            break;
                        }

                        if (fxL * fxU < 0) {
                            xu = xM;
                            roott = xM;
                        } else {
                            xl = xM;
                            roott = xM;
                        }

                        prevXM = xM;
                        xM = (xl + xu) / 2;
                        Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100;
                    }
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }
                   
                    if (roott != 0) {
                        String decimalRoot = format.format(roott);
                        root.setText(decimalRoot);
                        graph(equation.getText(), roott);
                       
                    } else {
                        JOptionPane.showMessageDialog(this, "No root found within the specified range.");
                    }
                   
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }else if (Selection.getSelectedIndex() == 4){
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#############");
                if (equation.getText().isEmpty() || xL.getText().isEmpty() || xU.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double xl = Double.parseDouble(xL.getText());
                    double xu = Double.parseDouble(xU.getText());
                    double fxL, fxU, fxR, xR;
                    int iterations = 0;
                    double prevXU = 0;
                    double Error = Double.MAX_VALUE;

                    while (Error > MarginE) {
                        iterations++;
                        fxL = evaluateFunc(equation.getText(), xl);
                        fxU = evaluateFunc(equation.getText(), xu);

                        // Regula Falsi formula for finding next approximation
                        xR = (fxU * xl - fxL * xu) / (fxU - fxL);
                        fxR = evaluateFunc(equation.getText(), xR);

                        String decimalnumA = decimalFormat.format(xl);
                        String decimalnumB = decimalFormat.format(xu);
                        String decimalnumC = decimalFormat.format(xR);
                        String decimalnumFC = decimalFormat.format(fxR);
                        String decimalnumERROR;

                        if (iterations == 1) {
                            decimalnumERROR = " ";
                        } else {
                            double currentError = Math.abs(xR - prevXU) / Math.abs(xR) * 100;
                            decimalnumERROR = decimalFormat.format(currentError);
                        }

                        Object[] rowData = {iterations, decimalnumA, decimalnumB,
                                decimalnumC, decimalnumFC, decimalnumERROR};
                        data.add(rowData);

                        if (fxL * fxR < 0) {
                            xu = xR;
                        } else if (fxL * fxR > 0) {
                            xl = xR;
                        }

                        prevXU = xR;
                        Error = Math.abs(fxR); // Error is now based on the value of f(xR)
                    }

                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }



                    // Displaying the root, assuming it's the last computed xR
                    String decimalRoot = decimalFormat.format(prevXU); // Assuming the last computed xR is the root
                    root.setText(decimalRoot);
                    graph(equation.getText(), prevXU);
                }
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for lower and upper bounds.");
                }
        }else if (Selection.getSelectedIndex() == 5){
         try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##############");
            if (equation.getText().isEmpty() || xL.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
            } else {
                ArrayList<Object[]> data = new ArrayList<>();
                double MarginE = 0.001;
                double x0 = Double.parseDouble(xL.getText()); // Initial guess
                double x1;
                int iterations = 0;
                double error = Double.MAX_VALUE;

                while (error > MarginE) {
                    iterations++;
                    x1 = g(x0); // Fixed-point iteration: x1 = g(x0)

                    System.out.println(x1);

                    String decimalnumX0 = decimalFormat.format(x0);
                    String decimalnumX1 = decimalFormat.format(x1);
                    String decimalnumError;

                    if (iterations == 1) {
                        decimalnumError = " ";
                    } else {
                        double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                        error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                        decimalnumError = decimalFormat.format(error);
                    }

                    Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumError};
                    data.add(rowData);

                    x0 = x1;
                }

                DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                model.setRowCount(0);

                for (Object[] row : data) {
                    model.addRow(row);
                }
                // Displaying the root, assuming it's the last computed x1
                String decimalRoot = decimalFormat.format(x0);
                root.setText(decimalRoot);
                graph(equation.getText(), x0);
              }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for lower and upper bounds.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
             
        }else if (Selection.getSelectedIndex() == 6){
             try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#############");
                if (equation.getText().isEmpty() || xL.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(xL.getText()); // Initial guess
                    double fx0, fDashX0, x1, fx1;
                    int iterations = 0;
                    double error = Double.MAX_VALUE;

                    while (error > MarginE) {
                        iterations++;
                        fx0 = evaluateFunc(equation.getText(), x0);
                        fDashX0 = differentiateFunction(equation.getText(), x0);
                        System.out.println(fDashX0);

                        // Newton-Raphson formula for finding next approximation
                        x1 = x0 - (fx0 / fDashX0);
                        fx1 = evaluateFunc(equation.getText(), x1);

                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumFX0 = decimalFormat.format(fx0);
                        String decimalnumFX1 = decimalFormat.format(fx1);
                        String decimalnumError;

                        if (iterations == 1) {
                            decimalnumError = " ";
                        } else {
                            double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                            error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                            decimalnumError = decimalFormat.format(error);
                        }

                        Object[] rowData = {iterations, decimalnumX0, decimalnumFX0, decimalnumX1, decimalnumFX1, decimalnumError};
                        data.add(rowData);

                        x0 = x1;
                    }

                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);

                    for (Object[] row : data) {
                        model.addRow(row);
                    }

                    // Displaying the root, assuming it's the last computed x1
                    String decimalRoot = decimalFormat.format(x0);
                    root.setText(decimalRoot);
                    graph(equation.getText(), x0);
                }
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for lower and upper bounds.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else if (Selection.getSelectedIndex() == 7){
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.#############");
                if (equation.getText().isEmpty() || xL.getText().isEmpty() || xU.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "ENTER THE NECESSARY DATA NEEDED!");
                } else {
                    ArrayList<Object[]> data = new ArrayList<>();
                    double MarginE = 0.001;
                    double x0 = Double.parseDouble(xL.getText());
                    double x1 = Double.parseDouble(xU.getText());
                    int iterations = 0;
                    double roott = 0;
                    double error = Double.MAX_VALUE; // Initialize error with a large value

                    while (error > MarginE) {
                        iterations++;
                        double fx0 = evaluateFunc(equation.getText(), x0);
                        double fx1 = evaluateFunc(equation.getText(), x1);
                        double numerator = fx1 * (x0 - x1);
                        double denominator = fx0 - fx1;
                        double x2 = x1 - numerator / denominator;
                        double fx2 = evaluateFunc(equation.getText(), x2);

                        // Update error based on the difference between x2 and x1
                        error = Math.abs(x2 - x1);

                        // Check if the error is within the acceptable range
                        if (error <= MarginE) {
                            roott = x2; // Update the root
                            break; // Terminate the loop if error is within the acceptable range
                        }

                        // Update values for next iteration
                        x0 = x1;
                        x1 = x2;

                        // Decimal formatting and adding data to the table
                        String decimalnumX0 = decimalFormat.format(x0);
                        String decimalnumX1 = decimalFormat.format(x1);
                        String decimalnumX2 = decimalFormat.format(x2);
                        String decimalnumFx0 = decimalFormat.format(fx0);
                        String decimalnumFx1 = decimalFormat.format(fx1);
                        String decimalnumFx2 = decimalFormat.format(fx2);
                        String decimalnumE = decimalFormat.format(error);

                        Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumX2, decimalnumFx0, decimalnumFx1, decimalnumFx2, decimalnumE};
                        data.add(rowData);
                    }

                    // Update table model with data
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.setRowCount(0);
                    for (Object[] row : data) {
                        model.addRow(row);
                    }
                    
                    // Update the root value
                    String decimalRoot = decimalFormat.format(roott);
                    root.setText(decimalRoot);

                    // Update the graph
                    graph(equation.getText(), roott);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "CHECK YOUR DATA INPUT!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionActionPerformed
      if(Selection.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "I N V A L I D   S E L E C T I O N");
        }else if (Selection.getSelectedIndex() == 1){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"x", "fx"});
            editedLabel.setText("----");
            xL.setText("");
            xU.setEnabled(false);
            xU.setText("");
        }else if(Selection.getSelectedIndex() == 2){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "xR", "xU", "f(xl)", "f(xU)", "Error", "f(xl)*f(xU)"});
            editedLabel.setText("deltaX:");
            xL.setText("");
            xU.setEnabled(true);
            xU.setText("");
        }else if (Selection.getSelectedIndex() == 3){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "xR", "xU", "f(xl)", "f(xU)", "Error"});
            editedLabel.setText("xU:");
            xL.setText("");
            xU.setEnabled(true);
            xU.setText("");
        }else if (Selection.getSelectedIndex() == 4){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "xU", "xR", "f(xR)", "Error"});
            editedLabel.setText("xU:");
            xL.setText("");
            xU.setEnabled(true);
            xU.setText("");
        }else if (Selection.getSelectedIndex() == 5){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "fxL", "Ea"});
            editedLabel.setText("----");
            xL.setText("");
            xU.setEnabled(false);
            xU.setText("");
        } else if (Selection.getSelectedIndex() == 6){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"Iterations", "xL", "fxL", "x1", "f(x1)", "Ea"});
            editedLabel.setText("----");
            xL.setText("");
            xU.setEnabled(false);
            xU.setText("");
            } else if (Selection.getSelectedIndex() == 7){
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            root.setText("");
            graph.removeAll();
            graph.revalidate();
            graph.repaint();
            model.setColumnIdentifiers(new String[]{"X", "x", "X", "X", "X)", "X"});
            editedLabel.setText("xU");
            xL.setText("");
            xU.setEnabled(true);
            xU.setText("");
        }
    }//GEN-LAST:event_SelectionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Selection;
    private javax.swing.JLabel editedLabel;
    private javax.swing.JTextField equation;
    private javax.swing.JPanel graph;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField root;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField xL;
    private javax.swing.JTextField xU;
    // End of variables declaration//GEN-END:variables
  
   private static double evaluateFunc(String expression, double x) {
        // Create an expression with the given string and variable
        Expression e = new ExpressionBuilder(expression)
                .variable("x")
                .build()
                .setVariable("x", x);

        // Evaluate the expression
        return e.evaluate();
    }
 private double g(double x) {
    // Example: Let's choose g(x) = x - f(x) / f'(x), similar to the Newton-Raphson method
    double fx = evaluateFunc(equation.getText(), x);
    double fDashX = differentiateFunction(equation.getText(), x);

    // Avoid division by zero
    if (fDashX == 0) {
        throw new ArithmeticException("Derivative is zero. Division by zero error.");
    }

    return x - (fx / fDashX);
}

private double differentiateFunction(String equationStr, double xValue) {
    double h = 0.000001; // a small value
    return (evaluateFunc(equationStr, xValue + h) - evaluateFunc(equationStr, xValue)) / h;
}


private void graph(String equationStr, double roots) {
    XYSeries series = new XYSeries("Function");

    double step = 0.1;
    for (double x = -10.0; x <= 10.0; x += step) {
        double y = evaluateFunc(equationStr, x); // Evaluating the function at each x value
        // Ensure that y-values are within the range of -10 to 10
        if (y >= -10 && y <= 10) {
            series.add(x, y); // Adding the (x, y) pair to the series if y is within the range
        }
    }
    

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "GRAPH",
                "X",
                "f(X)",
                dataset
        );
            chart.setBackgroundPaint(Color.WHITE);

        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

        plot.getRenderer().setSeriesPaint(0, Color.BLUE);

        XYSeries rootSeries = new XYSeries("Root");
        rootSeries.add(roots, evaluateFunc(equation.getText(), roots));
        XYSeriesCollection rootDataset = new XYSeriesCollection();
        rootDataset.addSeries(rootSeries);
        plot.setDataset(1, rootDataset);
        plot.mapDatasetToDomainAxis(1, 0);
        plot.mapDatasetToRangeAxis(1, 0);
        XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
        renderer.setSeriesPaint(0, Color.RED); 
        plot.setRenderer(1, renderer);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(580, 350));
        
        graph.setLayout(new BorderLayout());
        graph.removeAll();
        graph.add(chartPanel, BorderLayout.CENTER);
        graph.revalidate();
        graph.repaint();
    }
}
    
