import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

val sdf:SimpleDateFormat =new SimpleDateFormat("dd-mm-yyyy")
println(sdf.format(Calendar.getInstance().getTime()))
//logger("My message",datelog)
