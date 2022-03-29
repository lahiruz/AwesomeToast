package mediacorp.cia.awasometoast

import android.content.Context
import android.widget.Toast

object AwesomeToast {
    fun show(context: Context) {
        Toast.makeText(context, "Hi, Welcome", Toast.LENGTH_SHORT).show()
    }
}