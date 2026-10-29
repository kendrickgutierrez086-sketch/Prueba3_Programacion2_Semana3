package prueba3_programacion2_semana3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Formulario de gestion de empleados.
 * Los componentes visuales se pueden editar desde el disenador de NetBeans.
 */
public class FormularioEmpleados extends javax.swing.JFrame {

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private Empleado clonPendiente;

    public FormularioEmpleados() {
        initComponents();
        configurarModelos();
        setLocationRelativeTo(null);
        actualizarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSalarioBase = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblBonificacion = new javax.swing.JLabel();
        txtBonificacion = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblTarifa = new javax.swing.JLabel();
        txtTarifa = new javax.swing.JTextField();
        pnlAcciones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnClonar = new javax.swing.JButton();
        btnRegistrarClon = new javax.swing.JButton();
        btnComparar = new javax.swing.JButton();
        btnMaximo = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        scrTabla = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Empleados");
        setMinimumSize(new java.awt.Dimension(1080, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(35, 55, 80));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SISTEMA DE GESTIÓN DE EMPLEADOS");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(20, 10, 1020, 40);

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado"));
        pnlDatos.setLayout(null);

        lblCodigo.setText("Código:");
        pnlDatos.add(lblCodigo);
        lblCodigo.setBounds(15, 30, 110, 25);

        pnlDatos.add(txtCodigo);
        txtCodigo.setBounds(130, 30, 205, 25);

        lblNombre.setText("Nombre:");
        pnlDatos.add(lblNombre);
        lblNombre.setBounds(15, 65, 110, 25);

        pnlDatos.add(txtNombre);
        txtNombre.setBounds(130, 65, 205, 25);

        lblSalarioBase.setText("Salario base:");
        pnlDatos.add(lblSalarioBase);
        lblSalarioBase.setBounds(15, 100, 110, 25);

        pnlDatos.add(txtSalarioBase);
        txtSalarioBase.setBounds(130, 100, 205, 25);

        lblTipo.setText("Tipo de empleado:");
        pnlDatos.add(lblTipo);
        lblTipo.setBounds(15, 135, 110, 25);

        cmbTipo.addActionListener(this::cmbTipoActionPerformed);
        pnlDatos.add(cmbTipo);
        cmbTipo.setBounds(130, 135, 205, 25);

        lblBonificacion.setText("Bonificación:");
        pnlDatos.add(lblBonificacion);
        lblBonificacion.setBounds(15, 170, 110, 25);

        pnlDatos.add(txtBonificacion);
        txtBonificacion.setBounds(130, 170, 205, 25);

        lblDescuento.setText("Descuento (%):");
        pnlDatos.add(lblDescuento);
        lblDescuento.setBounds(15, 205, 110, 25);

        pnlDatos.add(txtDescuento);
        txtDescuento.setBounds(130, 205, 205, 25);

        lblHoras.setText("Horas trabajadas:");
        pnlDatos.add(lblHoras);
        lblHoras.setBounds(15, 240, 110, 25);

        pnlDatos.add(txtHoras);
        txtHoras.setBounds(130, 240, 205, 25);

        lblTarifa.setText("Tarifa por hora:");
        pnlDatos.add(lblTarifa);
        lblTarifa.setBounds(15, 275, 110, 25);

        pnlDatos.add(txtTarifa);
        txtTarifa.setBounds(130, 275, 205, 25);

        getContentPane().add(pnlDatos);
        pnlDatos.setBounds(20, 60, 355, 315);

        pnlAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        pnlAcciones.setLayout(null);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        pnlAcciones.add(btnRegistrar);
        btnRegistrar.setBounds(15, 25, 150, 30);

        btnCalcular.setText("Calcular salario");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);
        pnlAcciones.add(btnCalcular);
        btnCalcular.setBounds(175, 25, 150, 30);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        pnlAcciones.add(btnBuscar);
        btnBuscar.setBounds(15, 65, 150, 30);

        btnClonar.setText("Clonar empleado");
        btnClonar.addActionListener(this::btnClonarActionPerformed);
        pnlAcciones.add(btnClonar);
        btnClonar.setBounds(175, 65, 150, 30);

        btnRegistrarClon.setText("Registrar clon");
        btnRegistrarClon.addActionListener(this::btnRegistrarClonActionPerformed);
        pnlAcciones.add(btnRegistrarClon);
        btnRegistrarClon.setBounds(15, 105, 150, 30);

        btnComparar.setText("Comparar objetos");
        btnComparar.addActionListener(this::btnCompararActionPerformed);
        pnlAcciones.add(btnComparar);
        btnComparar.setBounds(175, 105, 150, 30);

        btnMaximo.setText("Salario máximo");
        btnMaximo.addActionListener(this::btnMaximoActionPerformed);
        pnlAcciones.add(btnMaximo);
        btnMaximo.setBounds(15, 145, 150, 30);

        btnPromedio.setText("Promedio");
        btnPromedio.addActionListener(this::btnPromedioActionPerformed);
        pnlAcciones.add(btnPromedio);
        btnPromedio.setBounds(175, 145, 150, 30);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        pnlAcciones.add(btnLimpiar);
        btnLimpiar.setBounds(15, 185, 310, 30);

        getContentPane().add(pnlAcciones);
        pnlAcciones.setBounds(20, 385, 355, 230);

        pnlTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados registrados"));
        pnlTabla.setLayout(null);

        tblEmpleados.setRowHeight(23);
        tblEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrTabla.setViewportView(tblEmpleados);

        pnlTabla.add(scrTabla);
        scrTabla.setBounds(10, 25, 630, 510);

        lblBuscar.setText("Código para buscar:");
        pnlTabla.add(lblBuscar);
        lblBuscar.setBounds(15, 545, 130, 25);

        pnlTabla.add(txtBuscar);
        txtBuscar.setBounds(145, 545, 200, 25);

        getContentPane().add(pnlTabla);
        pnlTabla.setBounds(390, 60, 655, 585);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Modelos del combo y de la tabla. Se asignan por codigo (fuera del bloque
     * generado) para que el disenador de NetBeans no dependa de editores de modelo.
     */
    private void configurarModelos() {
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Por horas" }));
        tblEmpleados.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "Código", "Nombre", "Tipo", "Salario calculado", "Categoría" }
        ) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        });
    }

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarCampos();
    }

    private void actualizarCampos() {
        boolean administrativo = cmbTipo.getSelectedIndex() == 0;
        txtBonificacion.setEnabled(administrativo);
        txtDescuento.setEnabled(administrativo);
        txtHoras.setEnabled(!administrativo);
        txtTarifa.setEnabled(!administrativo);
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String codigo = txtCodigo.getText().trim();
            String nombre = txtNombre.getText().trim();
            if (codigo.isEmpty() || nombre.isEmpty() || txtSalarioBase.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Complete codigo, nombre y salario base.");
            }
            if (buscarPorCodigo(codigo) != null) {
                throw new IllegalArgumentException("Ya existe un empleado con ese codigo.");
            }
            double base = Double.parseDouble(txtSalarioBase.getText().trim());
            if (base < 0) throw new IllegalArgumentException("El salario base no puede ser negativo.");

            Empleado empleado;
            if (cmbTipo.getSelectedIndex() == 0) {
                double bonificacion = Double.parseDouble(txtBonificacion.getText().trim());
                double descuento = Double.parseDouble(txtDescuento.getText().trim());
                empleado = new EmpleadoAdministrativo(codigo, nombre, base, bonificacion, descuento);
            } else {
                int horas = Integer.parseInt(txtHoras.getText().trim());
                double tarifa = Double.parseDouble(txtTarifa.getText().trim());
                empleado = new EmpleadoPorHoras(codigo, nombre, base, horas, tarifa);
            }
            empleados.add(empleado);
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Empleado registrado correctamente.");
            limpiarFormulario();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Revise los campos numericos.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "No se pudo registrar", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Empleado buscarPorCodigo(String codigo) {
        for (Empleado empleado : empleados) {
            if (empleado.getCodigo().equalsIgnoreCase(codigo)) return empleado;
        }
        return null;
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblEmpleados.getModel();
        modelo.setRowCount(0);
        for (Empleado empleado : empleados) {
            String tipo = (empleado instanceof EmpleadoAdministrativo) ? "Administrativo" : "Por horas";
            modelo.addRow(new Object[] {
                empleado.getCodigo(), empleado.getNombre(), tipo,
                String.format("L %.2f", empleado.calcularSalario()), empleado.obtenerCategoria()
            });
        }
    }

    private Empleado empleadoSeleccionado() {
        int fila = tblEmpleados.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado en la tabla.");
            return null;
        }
        return buscarPorCodigo(tblEmpleados.getValueAt(fila, 0).toString());
    }

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        Empleado empleado = empleadoSeleccionado();
        if (empleado != null) {
            JOptionPane.showMessageDialog(this, "Salario calculado: L "
                    + String.format("%.2f", empleado.calcularSalario()));
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = txtBuscar.getText().trim();
        if (codigo.isEmpty()) codigo = txtCodigo.getText().trim();
        Empleado empleado = buscarPorCodigo(codigo);
        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "No se encontro un empleado con ese codigo.");
            return;
        }
        for (int i = 0; i < tblEmpleados.getRowCount(); i++) {
            if (tblEmpleados.getValueAt(i, 0).toString().equalsIgnoreCase(empleado.getCodigo())) {
                tblEmpleados.setRowSelectionInterval(i, i);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, empleado.mostrarInformacion());
    }

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {
        Empleado original = empleadoSeleccionado();
        if (original == null) return;
        clonPendiente = original.clone();
        clonPendiente.setCodigo("");
        txtCodigo.setText("");
        txtNombre.setText(clonPendiente.getNombre());
        txtSalarioBase.setText(String.valueOf(clonPendiente.getSalarioBase()));
        if (clonPendiente instanceof EmpleadoAdministrativo) {
            EmpleadoAdministrativo a = (EmpleadoAdministrativo) clonPendiente;
            cmbTipo.setSelectedIndex(0);
            txtBonificacion.setText(String.valueOf(a.getBonificacion()));
            txtDescuento.setText(String.valueOf(a.getDescuento()));
        } else {
            EmpleadoPorHoras h = (EmpleadoPorHoras) clonPendiente;
            cmbTipo.setSelectedIndex(1);
            txtHoras.setText(String.valueOf(h.getHorasTrabajadas()));
            txtTarifa.setText(String.valueOf(h.getTarifaPorHora()));
        }
        JOptionPane.showMessageDialog(this, "Copia preparada. Escriba un codigo nuevo y pulse Registrar clon.");
    }

    private void btnRegistrarClonActionPerformed(java.awt.event.ActionEvent evt) {
        if (clonPendiente == null) {
            JOptionPane.showMessageDialog(this, "Primero clone un empleado.");
            return;
        }
        try {
            String codigo = txtCodigo.getText().trim();
            String nombre = txtNombre.getText().trim();
            if (codigo.isEmpty() || nombre.isEmpty()) throw new IllegalArgumentException("Escriba un codigo nuevo y un nombre.");
            if (buscarPorCodigo(codigo) != null) throw new IllegalArgumentException("Ese codigo ya existe.");

            clonPendiente.setCodigo(codigo);
            clonPendiente.setNombre(nombre);
            clonPendiente.setSalarioBase(Double.parseDouble(txtSalarioBase.getText().trim()));
            if (clonPendiente instanceof EmpleadoAdministrativo) {
                EmpleadoAdministrativo a = (EmpleadoAdministrativo) clonPendiente;
                a.setBonificacion(Double.parseDouble(txtBonificacion.getText().trim()));
                a.setDescuento(Double.parseDouble(txtDescuento.getText().trim()));
            } else {
                EmpleadoPorHoras h = (EmpleadoPorHoras) clonPendiente;
                h.setHorasTrabajadas(Integer.parseInt(txtHoras.getText().trim()));
                h.setTarifaPorHora(Double.parseDouble(txtTarifa.getText().trim()));
            }
            empleados.add(clonPendiente);
            clonPendiente = null;
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Clon registrado correctamente.");
            limpiarFormulario();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Revise los campos numericos.", "Dato invalido", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {
        Empleado primero = empleadoSeleccionado();
        if (primero == null) return;
        String codigo = JOptionPane.showInputDialog(this, "Codigo del segundo empleado:");
        if (codigo == null || codigo.trim().isEmpty()) return;
        Empleado segundo = buscarPorCodigo(codigo.trim());
        if (segundo == null) {
            JOptionPane.showMessageDialog(this, "No existe ese empleado.");
            return;
        }
        boolean mismaReferencia = primero == segundo;
        boolean mismosDatos = primero.getNombre().equals(segundo.getNombre())
                && primero.getSalarioBase() == segundo.getSalarioBase()
                && primero.calcularSalario() == segundo.calcularSalario();
        JOptionPane.showMessageDialog(this, "Misma referencia (==): " + mismaReferencia
                + "\nDatos principales equivalentes: " + mismosDatos);
    }

    private void btnMaximoActionPerformed(java.awt.event.ActionEvent evt) {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay empleados registrados.");
            return;
        }
        Empleado mayor = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.calcularSalario() > mayor.calcularSalario()) mayor = empleado;
        }
        JOptionPane.showMessageDialog(this, "Empleado con mayor salario:\n" + mayor.mostrarInformacion());
    }

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay empleados registrados.");
            return;
        }
        double suma = 0;
        for (Empleado empleado : empleados) suma += empleado.calcularSalario();
        JOptionPane.showMessageDialog(this, "Promedio salarial: L "
                + String.format("%.2f", suma / empleados.size()));
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiarFormulario();
    }

    private void limpiarFormulario() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtSalarioBase.setText("");
        txtBonificacion.setText("");
        txtDescuento.setText("");
        txtHoras.setText("");
        txtTarifa.setText("");
        txtBuscar.setText("");
        clonPendiente = null;
        cmbTipo.setSelectedIndex(0);
        txtCodigo.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormularioEmpleados().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnClonar;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMaximo;
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarClon;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel lblBonificacion;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlAcciones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtBonificacion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTarifa;
    // End of variables declaration//GEN-END:variables
}
