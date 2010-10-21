using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace HelloServiceClientApplication
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            HelloServiceReference.HelloClient service = new HelloServiceReference.HelloClient();
            try
            {
                String result = service.sayHello3(textBox1.Text);
                MessageBox.Show(result);
            }
            catch (System.ServiceModel.FaultException<HelloServiceReference.HelloException> ex)
            {
                MessageBox.Show("Fault:" + ex.Detail.code, ex.Detail.message);
                Debug.WriteLine(ex.ToString());
            }
        }
    }
}
