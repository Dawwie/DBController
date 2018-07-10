using System;
using System.Data.SqlClient;
using System.Data;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace DBController
{
    class MsSQL
    {
        public static void Main(string[] args)
        {
            string connect = "Server=mssql-2016.labs.wmi.amu.edu.pl;Database=dbad_s434804;Uid=s434804;Pwd=<haslo>";
            SqlConnection con = new SqlConnection(connect);

            con.Open();
            SqlCommand command = new SqlCommand("SELECT imie,nazwisko,dyzur FROM Nauczyciele",con);
            SqlDataReader reader = command.ExecuteReader();
            Console.WriteLine("IMIE" + " " + "NAZWISKO" + " " + "DYŻUR");
            while (reader.Read())
            {
                string name = (string)reader["imie"];
                string surname = (string)reader["nazwisko"];
                string duty = (string)reader["dyzur"];
                Console.WriteLine(name + " " + surname + " " + duty);
            }
            reader.Close();
            command.Dispose();
            con.Close();
        }
    }
}
