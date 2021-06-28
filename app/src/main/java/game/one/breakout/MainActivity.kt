package game.one.breakout

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import game.one.breakout.puzzlelist.*

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.os.Handler().postDelayed({
            val v: TextView = findViewById(R.id.vmain)
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            val reselect = preferences.getString("levelselect", "defaultValue")
            v.text = reselect
            editor.putString("levelselect",v.text.toString())
            editor.apply()
            val re1 = preferences.getString("puzzle1", "defaultValue")
            v.text = re1
            editor.putString("puzzle1",v.text.toString())
            editor.apply()
            val re2 = preferences.getString("puzzle2", "defaultValue")
            v.text = re2
            editor.putString("puzzle2",v.text.toString())
            editor.apply()
            val re3 = preferences.getString("puzzle3", "defaultValue")
            v.text = re3
            editor.putString("puzzle3",v.text.toString())
            editor.apply()
            val re4 = preferences.getString("puzzle4", "defaultValue")
            v.text = re4
            editor.putString("puzzle4",v.text.toString())
            editor.apply()
            val re5 = preferences.getString("puzzle5", "defaultValue")
            v.text = re5
            editor.putString("puzzle5",v.text.toString())
            editor.apply()
            val re6 = preferences.getString("puzzle6", "defaultValue")
            v.text = re6
            editor.putString("puzzle6",v.text.toString())
            editor.apply()
            val re7 = preferences.getString("puzzle7", "defaultValue")
            v.text = re7
            editor.putString("puzzle7",v.text.toString())
            editor.apply()
            val re8 = preferences.getString("puzzle8", "defaultValue")
            v.text = re8
            editor.putString("puzzle8",v.text.toString())
            editor.apply()
            val re9 = preferences.getString("puzzle9", "defaultValue")
            v.text = re9
            editor.putString("puzzle9",v.text.toString())
            editor.apply()
            val re10 = preferences.getString("puzzle10", "defaultValue")
            v.text = re10
            editor.putString("puzzle10",v.text.toString())
            editor.apply()
            val re11 = preferences.getString("puzzle11", "defaultValue")
            v.text = re11
            editor.putString("puzzle11",v.text.toString())
            editor.apply()
            val re12 = preferences.getString("puzzle12", "defaultValue")
            v.text = re12
            editor.putString("puzzle12",v.text.toString())
            editor.apply()
            val re13 = preferences.getString("puzzle13", "defaultValue")
            v.text = re13
            editor.putString("puzzle13",v.text.toString())
            editor.apply()
            val re14 = preferences.getString("puzzle14", "defaultValue")
            v.text = re14
            editor.putString("puzzle14",v.text.toString())
            editor.apply()
            val re15 = preferences.getString("puzzle15", "defaultValue")
            v.text = re15
            editor.putString("puzzle15",v.text.toString())
            editor.apply()
            val re16 = preferences.getString("puzzle16", "defaultValue")
            v.text = re16
            editor.putString("puzzle16",v.text.toString())
            editor.apply()
            val re17 = preferences.getString("puzzle17", "defaultValue")
            v.text = re17
            editor.putString("puzzle17",v.text.toString())
            editor.apply()
            val re18 = preferences.getString("puzzle18", "defaultValue")
            v.text = re18
            editor.putString("puzzle18",v.text.toString())
            editor.apply()
            val re19 = preferences.getString("puzzle19", "defaultValue")
            v.text = re19
            editor.putString("puzzle19",v.text.toString())
            editor.apply()
            val re20 = preferences.getString("puzzle20", "defaultValue")
            v.text = re20
            editor.putString("puzzle20",v.text.toString())
            editor.apply()
            val re21 = preferences.getString("puzzle21", "defaultValue")
            v.text = re21
            editor.putString("puzzle21",v.text.toString())
            editor.apply()
            val re22 = preferences.getString("puzzle22", "defaultValue")
            v.text = re22
            editor.putString("puzzle22",v.text.toString())
            editor.apply()
            val re23 = preferences.getString("puzzle23", "defaultValue")
            v.text = re23
            editor.putString("puzzle23",v.text.toString())
            editor.apply()
            val re24 = preferences.getString("puzzle24", "defaultValue")
            v.text = re24
            editor.putString("puzzle24",v.text.toString())
            editor.apply()
            val re25 = preferences.getString("puzzle25", "defaultValue")
            v.text = re25
            editor.putString("puzzle25",v.text.toString())
            editor.apply()
            val re26 = preferences.getString("puzzle26", "defaultValue")
            v.text = re26
            editor.putString("puzzle26",v.text.toString())
            editor.apply()
            val re27 = preferences.getString("puzzle27", "defaultValue")
            v.text = re27
            editor.putString("puzzle27",v.text.toString())
            editor.apply()
            val re28 = preferences.getString("puzzle28", "defaultValue")
            v.text = re28
            editor.putString("puzzle28",v.text.toString())
            editor.apply()
            val re29 = preferences.getString("puzzle29", "defaultValue")
            v.text = re29
            editor.putString("puzzle29",v.text.toString())
            editor.apply()
            val re30 = preferences.getString("puzzle30", "defaultValue")
            v.text = re30
            editor.putString("puzzle30",v.text.toString())
            editor.apply()
            val re31 = preferences.getString("puzzle31", "defaultValue")
            v.text = re31
            editor.putString("puzzle31",v.text.toString())
            editor.apply()
            val re32 = preferences.getString("puzzle32", "defaultValue")
            v.text = re32
            editor.putString("puzzle32",v.text.toString())
            editor.apply()
            val re33 = preferences.getString("puzzle33", "defaultValue")
            v.text = re33
            editor.putString("puzzle33",v.text.toString())
            editor.apply()
            val re34 = preferences.getString("puzzle34", "defaultValue")
            v.text = re34
            editor.putString("puzzle34",v.text.toString())
            editor.apply()
            val re35 = preferences.getString("puzzle35", "defaultValue")
            v.text = re35
            editor.putString("puzzle35",v.text.toString())
            editor.apply()
            val re36 = preferences.getString("puzzle36", "defaultValue")
            v.text = re36
            editor.putString("puzzle36",v.text.toString())
            editor.apply()
            val re37 = preferences.getString("puzzle37", "defaultValue")
            v.text = re37
            editor.putString("puzzle37",v.text.toString())
            editor.apply()
            val re38 = preferences.getString("puzzle38", "defaultValue")
            v.text = re38
            editor.putString("puzzle38",v.text.toString())
            editor.apply()
            val re39 = preferences.getString("puzzle39", "defaultValue")
            v.text = re39
            editor.putString("puzzle39",v.text.toString())
            editor.apply()
            val re40 = preferences.getString("puzzle40", "defaultValue")
            v.text = re40
            editor.putString("puzzle40",v.text.toString())
            editor.apply()
            val re41 = preferences.getString("puzzle41", "defaultValue")
            v.text = re41
            editor.putString("puzzle41",v.text.toString())
            editor.apply()
            val re42 = preferences.getString("puzzle42", "defaultValue")
            v.text = re42
            editor.putString("puzzle42",v.text.toString())
            editor.apply()
            val re43 = preferences.getString("puzzle43", "defaultValue")
            v.text = re43
            editor.putString("puzzle43",v.text.toString())
            editor.apply()
            val re44 = preferences.getString("puzzle44", "defaultValue")
            v.text = re44
            editor.putString("puzzle44",v.text.toString())
            editor.apply()
            val re45 = preferences.getString("puzzle45", "defaultValue")
            v.text = re45
            editor.putString("puzzle45",v.text.toString())
            editor.apply()
            val re46 = preferences.getString("puzzle46", "defaultValue")
            v.text = re46
            editor.putString("puzzle46",v.text.toString())
            editor.apply()
            val re47 = preferences.getString("puzzle47", "defaultValue")
            v.text = re47
            editor.putString("puzzle47",v.text.toString())
            editor.apply()
            val re48 = preferences.getString("puzzle48", "defaultValue")
            v.text = re48
            editor.putString("puzzle48",v.text.toString())
            editor.apply()
            val re49 = preferences.getString("puzzle49", "defaultValue")
            v.text = re49
            editor.putString("puzzle49",v.text.toString())
            editor.apply()
            val re50 = preferences.getString("puzzle50", "defaultValue")
            v.text = re50
            editor.putString("puzzle50",v.text.toString())
            editor.apply()
            if (re1 == "one"){
                val lock1: ImageView = findViewById(R.id.lock1)
                lock1.setImageResource(R.drawable.unlocked1)
                lock1.translationX = (-10F)
            }
            if (re2 == "two"){
                val lock2: ImageView = findViewById(R.id.lock2)
                lock2.setImageResource(R.drawable.unlocked1)
                lock2.translationX = (-10F)
            }
            if (re3 == "three"){
                val lock3: ImageView = findViewById(R.id.lock3)
                lock3.setImageResource(R.drawable.unlocked1)
                lock3.translationX = (-10F)
            }
            if (re4 == "four"){
                val lock4: ImageView = findViewById(R.id.lock4)
                lock4.setImageResource(R.drawable.unlocked1)
                lock4.translationX = (-10F)
            }
            if (re5 == "five"){
                val lock5: ImageView = findViewById(R.id.lock5)
                lock5.setImageResource(R.drawable.unlocked1)
                lock5.translationX = (-10F)
            }
            if (re6 == "six"){
                val lock6: ImageView = findViewById(R.id.lock6)
                lock6.setImageResource(R.drawable.unlocked1)
                lock6.translationX = (-10F)
            }
            if (re7 == "seven"){
                val lock7: ImageView = findViewById(R.id.lock7)
                lock7.setImageResource(R.drawable.unlocked1)
                lock7.translationX = (-10F)
            }
            if (re8 == "eight"){
                val lock8: ImageView = findViewById(R.id.lock8)
                lock8.setImageResource(R.drawable.unlocked1)
                lock8.translationX = (-10F)
            }
            if (re9 == "nine"){
                val lock9: ImageView = findViewById(R.id.lock9)
                lock9.setImageResource(R.drawable.unlocked1)
                lock9.translationX = (-10F)
            }
            if (re10 == "ten"){
                val lock10: ImageView = findViewById(R.id.lock10)
                lock10.setImageResource(R.drawable.unlocked1)
                lock10.translationX = (-10F)
            }
            if (re11 == "eleven"){
                val lock11: ImageView = findViewById(R.id.lock11)
                lock11.setImageResource(R.drawable.unlocked1)
                lock11.translationX = (-10F)
            }
            if (re12 == "twelve"){
                val lock12: ImageView = findViewById(R.id.lock12)
                lock12.setImageResource(R.drawable.unlocked1)
                lock12.translationX = (-10F)
            }
            if (re13 == "thirteen"){
                val lock13: ImageView = findViewById(R.id.lock13)
                lock13.setImageResource(R.drawable.unlocked1)
                lock13.translationX = (-10F)
            }
            if (re14 == "fourteen"){
                val lock14: ImageView = findViewById(R.id.lock14)
                lock14.setImageResource(R.drawable.unlocked1)
                lock14.translationX = (-10F)
            }
            if (re15 == "fifteen"){
                val lock15: ImageView = findViewById(R.id.lock15)
                lock15.setImageResource(R.drawable.unlocked1)
                lock15.translationX = (-10F)
            }
            if (re16 == "sixteen"){
                val lock16: ImageView = findViewById(R.id.lock16)
                lock16.setImageResource(R.drawable.unlocked1)
                lock16.translationX = (-10F)
            }
            if (re17 == "seventeen"){
                val lock17: ImageView = findViewById(R.id.lock17)
                lock17.setImageResource(R.drawable.unlocked1)
                lock17.translationX = (-10F)
            }
            if (re18 == "eighteen"){
                val lock18: ImageView = findViewById(R.id.lock18)
                lock18.setImageResource(R.drawable.unlocked1)
                lock18.translationX = (-10F)
            }
            if (re19 == "nineteen"){
                val lock19: ImageView = findViewById(R.id.lock19)
                lock19.setImageResource(R.drawable.unlocked1)
                lock19.translationX = (-10F)
            }
            if (re20== "twenty"){
                val lock20: ImageView = findViewById(R.id.lock20)
                lock20.setImageResource(R.drawable.unlocked1)
                lock20.translationX = (-10F)
            }
            if (re21 == "twenty-one"){
                val lock21: ImageView = findViewById(R.id.lock21)
                lock21.setImageResource(R.drawable.unlocked1)
                lock21.translationX = (-10F)
            }
            if (re22 == "twenty-two"){
                val lock22: ImageView = findViewById(R.id.lock22)
                lock22.setImageResource(R.drawable.unlocked1)
                lock22.translationX = (-10F)
            }
            if (re23 == "twenty-three"){
                val lock23: ImageView = findViewById(R.id.lock23)
                lock23.setImageResource(R.drawable.unlocked1)
                lock23.translationX = (-10F)
            }
            if (re24 == "twenty-four"){
                val lock24: ImageView = findViewById(R.id.lock24)
                lock24.setImageResource(R.drawable.unlocked1)
                lock24.translationX = (-10F)
            }
            if (re25 == "twenty-five"){
                val lock25: ImageView = findViewById(R.id.lock25)
                lock25.setImageResource(R.drawable.unlocked1)
                lock25.translationX = (-10F)
            }
            if (re26 == "twenty-six"){
                val lock26: ImageView = findViewById(R.id.lock26)
                lock26.setImageResource(R.drawable.unlocked1)
                lock26.translationX = (-10F)
            }
            if (re27 == "twenty-seven"){
                val lock27: ImageView = findViewById(R.id.lock27)
                lock27.setImageResource(R.drawable.unlocked1)
                lock27.translationX = (-10F)
            }
            if (re28 == "twenty-eight"){
                val lock28: ImageView = findViewById(R.id.lock28)
                lock28.setImageResource(R.drawable.unlocked1)
                lock28.translationX = (-10F)
            }
            if (re29 == "twenty-nine"){
                val lock29: ImageView = findViewById(R.id.lock29)
                lock29.setImageResource(R.drawable.unlocked1)
                lock29.translationX = (-10F)
            }
            if (re30 == "thirty"){
                val lock30: ImageView = findViewById(R.id.lock30)
                lock30.setImageResource(R.drawable.unlocked1)
                lock30.translationX = (-10F)
            }
            if (re31 == "thirty-one"){
                val lock31: ImageView = findViewById(R.id.lock31)
                lock31.setImageResource(R.drawable.unlocked1)
                lock31.translationX = (-10F)
            }
            if (re32 == "thirty-two"){
                val lock32: ImageView = findViewById(R.id.lock32)
                lock32.setImageResource(R.drawable.unlocked1)
                lock32.translationX = (-10F)
            }
            if (re33 == "thirty-three"){
                val lock33: ImageView = findViewById(R.id.lock33)
                lock33.setImageResource(R.drawable.unlocked1)
                lock33.translationX = (-10F)
            }
            if (re34 == "thirty-four"){
                val lock34: ImageView = findViewById(R.id.lock34)
                lock34.setImageResource(R.drawable.unlocked1)
                lock34.translationX = (-10F)
            }
            if (re35 == "thirty-five"){
                val lock35: ImageView = findViewById(R.id.lock35)
                lock35.setImageResource(R.drawable.unlocked1)
                lock35.translationX = (-10F)
            }
            if (re36 == "thirty-six"){
                val lock36: ImageView = findViewById(R.id.lock36)
                lock36.setImageResource(R.drawable.unlocked1)
                lock36.translationX = (-10F)
            }
            if (re37 == "thirty-seven"){
                val lock37: ImageView = findViewById(R.id.lock37)
                lock37.setImageResource(R.drawable.unlocked1)
                lock37.translationX = (-10F)
            }
            if (re38 == "thirty-eight"){
                val lock38: ImageView = findViewById(R.id.lock38)
                lock38.setImageResource(R.drawable.unlocked1)
                lock38.translationX = (-10F)
            }
            if (re39 == "thirty-nine"){
                val lock39: ImageView = findViewById(R.id.lock39)
                lock39.setImageResource(R.drawable.unlocked1)
                lock39.translationX = (-10F)
            }
            if (re40 == "forty"){
                val lock40: ImageView = findViewById(R.id.lock40)
                lock40.setImageResource(R.drawable.unlocked1)
                lock40.translationX = (-10F)
            }
            if (re41 == "forty-one"){
                val lock41: ImageView = findViewById(R.id.lock41)
                lock41.setImageResource(R.drawable.unlocked1)
                lock41.translationX = (-10F)
            }
            if (re42 == "forty-two"){
                val lock42: ImageView = findViewById(R.id.lock42)
                lock42.setImageResource(R.drawable.unlocked1)
                lock42.translationX = (-10F)
            }
            if (re43 == "forty-three"){
                val lock43: ImageView = findViewById(R.id.lock43)
                lock43.setImageResource(R.drawable.unlocked1)
                lock43.translationX = (-10F)
            }
            if (re44 == "forty-four"){
                val lock44: ImageView = findViewById(R.id.lock44)
                lock44.setImageResource(R.drawable.unlocked1)
                lock44.translationX = (-10F)
            }
            if (re45 == "forty-five"){
                val lock45: ImageView = findViewById(R.id.lock45)
                lock45.setImageResource(R.drawable.unlocked1)
                lock45.translationX = (-10F)
            }
            if (re46 == "forty-six"){
                val lock46: ImageView = findViewById(R.id.lock46)
                lock46.setImageResource(R.drawable.unlocked1)
                lock46.translationX = (-10F)
            }
            if (re47 == "forty-seven"){
                val lock47: ImageView = findViewById(R.id.lock47)
                lock47.setImageResource(R.drawable.unlocked1)
                lock47.translationX = (-10F)
            }
            if (re48 == "forty-eight"){
                val lock48: ImageView = findViewById(R.id.lock48)
                lock48.setImageResource(R.drawable.unlocked1)
                lock48.translationX = (-10F)
            }
            if (re49 == "forty-nine"){
                val lock49: ImageView = findViewById(R.id.lock49)
                lock49.setImageResource(R.drawable.unlocked1)
                lock49.translationX = (-10F)
            }
            if (re50 == "fifty"){
                val lock50: ImageView = findViewById(R.id.lock50)
                lock50.setImageResource(R.drawable.unlocked1)
                lock50.translationX = (-10F)
            }
        }, SPLASH_TIME.toLong())
    }

    fun Play(view: View) {
        val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
        val reselect = preferences.getString("levelselect", "defaultValue")
        if (reselect == "defaultValue" || reselect == "one"){
            val goto = Intent(this@MainActivity, Puzzlelist1::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "two"){
            val goto = Intent(this@MainActivity, Puzzlelist2::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "three"){
            val goto = Intent(this@MainActivity, Puzzlelist3::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "four"){
            val goto = Intent(this@MainActivity, Puzzlelist4::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "five"){
            val goto = Intent(this@MainActivity, Puzzlelist5::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "six"){
            val goto = Intent(this@MainActivity, Puzzlelist6::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "seven"){
            val goto = Intent(this@MainActivity, Puzzlelist7::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "eight"){
            val goto = Intent(this@MainActivity, Puzzlelist8::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "nine"){
            val goto = Intent(this@MainActivity, Puzzlelist9::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
        if (reselect == "ten"){
            val goto = Intent(this@MainActivity, Puzzlelist10::class.java)
            this@MainActivity.startActivity(goto)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }
    }

    fun Options(view: View) {
        val goto = Intent(this@MainActivity, Options::class.java)
        this@MainActivity.startActivity(goto)
        overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
    }

    override fun onBackPressed() {
        val a = Intent(Intent.ACTION_MAIN)
        a.addCategory(Intent.CATEGORY_HOME)
        a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(a)
    }

}
