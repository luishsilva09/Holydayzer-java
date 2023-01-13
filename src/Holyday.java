import java.util.List;
import java.util.ArrayList;

public class Holyday {
    List<String> Holydays = new ArrayList<String>();
    
    public String findHolyday(String holyDate){
        if(Holydays.contains(holyDate)){
            return "encontrei feriado";
        }
        return "encontrei";
    }

    public List getHolydaysList(){
        return Holydays;
    }
}
