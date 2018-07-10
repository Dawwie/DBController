using System;
using System.Data;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace DBController
{
    class MySQL
    {
        public static void Main(string[] args)
        {
            string connect = "Server=mysql.wmi.amu.edu.pl;Database=s434804_Szkola_Muzyczna;Uid=s434804;Pwd=<haslo>;SslMode=none";
            MySqlConnection con = new MySqlConnection(connect);

            con.Open();
            MySqlCommand command = con.CreateCommand();
            command.CommandText = "SELECT Imie,Nazwisko,Instrument FROM SzkolaMuzyczna";

            IDataReader reader = command.ExecuteReader();
            Console.WriteLine("IMIE" + " " + "NAZWISKO" + " " + "INSTRUMENT");
            while (reader.Read())
            {
                string name = (string)reader["Imie"];
                string surname = (string)reader["Nazwisko"];
                string instrument = (string)reader["Instrument"];
                Console.WriteLine(name + " " + surname + " " + instrument);
            }
            reader.Close();
            command.Dispose();
            con.Close();
        }
    }
}
