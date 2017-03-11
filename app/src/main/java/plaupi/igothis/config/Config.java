package plaupi.igothis.config;

/**
 * Created by Aziz on 05/03/2017.
 */

public class Config {

    public static final String URL = "http://sipeja.pe.hu/";

    //JSON for load status pembayaran
    public static final String JSON_ARRAY = "result";
    public static final String KEY_LUNAS = "Lunas"; //total lunas
    public static final String KEY_BELUMLUNAS = "BelumLunas"; //total belum lunas
    public static final String KEY_LABS = "nama"; //nama laboratorium

    //JSON for load status order
    public static final String KEY_TAHUN = "tahun";
    public static final String KEY_PROSES = "Proses";
    public static final String KEY_PERBAIKAN = "Perbaikan";
    public static final String KEY_BATAL = "Batal";
    public static final String KEY_SELESAI = "Selesai";
}
