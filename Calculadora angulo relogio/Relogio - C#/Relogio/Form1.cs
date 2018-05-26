using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Globalization;

namespace Relogio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }

        private void button_Calcular_Click(object sender, EventArgs e)
        {
            int angulo_m = 6;
            int angulo_h = 30;
            int minuto;
            int hora;
            int angulo_minuto;
            int angulo_hora;
            int menorAngulo;
            int maiorAngulo;
            int angulo = 360;

  
            DateTime time_hora = new DateTime();

            try
            {
                time_hora = Convert.ToDateTime(maskedTextBox1.Text);
            }
            catch
            {
                MessageBox.Show("Hora inserida incorreta - Ex: 23:59");
            }
            
                minuto = time_hora.Minute;
                hora = Convert.ToInt16(time_hora.ToString("%h"));
                

                angulo_minuto = angulo_m * minuto;
                angulo_hora = angulo_h * hora;

                //Printando e realizando o calculo do maior e menor angulo
                if (angulo_minuto > angulo_hora)
                {
                    menorAngulo = angulo_minuto - angulo_hora;
                    maiorAngulo = angulo - menorAngulo;
                    if (menorAngulo < maiorAngulo)
                    {
                        label_AnguloMaior.Text = Convert.ToString(maiorAngulo);
                        label_AnguloMenor.Text = Convert.ToString(menorAngulo);
                    }
                    else
                    {
                        label_AnguloMaior.Text = Convert.ToString(menorAngulo);
                        label_AnguloMenor.Text = Convert.ToString(maiorAngulo);
                    }
                }
                else if (angulo_minuto < angulo_hora)
                {
                    menorAngulo = angulo_hora - angulo_minuto;
                    maiorAngulo = angulo - menorAngulo;
                    if (menorAngulo < maiorAngulo)
                    {
                        label_AnguloMaior.Text = Convert.ToString(maiorAngulo);
                        label_AnguloMenor.Text = Convert.ToString(menorAngulo);
                    }
                    else
                    {
                        label_AnguloMaior.Text = Convert.ToString(menorAngulo);
                        label_AnguloMenor.Text = Convert.ToString(maiorAngulo);
                    }
                }
           
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label5.Text = DateTime.Now.ToShortTimeString();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
    }
}
