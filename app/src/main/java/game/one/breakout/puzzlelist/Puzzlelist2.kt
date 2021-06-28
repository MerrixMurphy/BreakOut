package game.one.breakout.puzzlelist

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import game.one.breakout.MainActivity
import game.one.breakout.OnSwipeTouchListener
import game.one.breakout.R
import game.one.breakout.puzzles.*

class Puzzlelist2 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist2)

        val swipe2: TextView = findViewById(R.id.swipe2)

        var x = false

        swipe2.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist2) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist2, Puzzlelist1::class.java)
                this@Puzzlelist2.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist2, Puzzlelist3::class.java)
                    this@Puzzlelist2.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level7: ImageView = findViewById(R.id.level7)
        level7.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level7.isEnabled = false
        val level8: ImageView = findViewById(R.id.level8)
        level8.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level8.isEnabled = false
        val level9: ImageView = findViewById(R.id.level9)
        level9.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level9.isEnabled = false
        val level10: ImageView = findViewById(R.id.level10)
        level10.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level10.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 5
        val many2: TextView = findViewById(R.id.many2)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "two")
            editor.apply()
            val re6 = preferences.getString("puzzle6", "defaultValue")
            val re7 = preferences.getString("puzzle7", "defaultValue")
            val re8 = preferences.getString("puzzle8", "defaultValue")
            val re9 = preferences.getString("puzzle9", "defaultValue")
            val re10 = preferences.getString("puzzle10", "defaultValue")
            val re11 = preferences.getString("puzzle11", "defaultValue")
            val re12 = preferences.getString("puzzle12", "defaultValue")
            val re13 = preferences.getString("puzzle13", "defaultValue")
            val re14 = preferences.getString("puzzle14", "defaultValue")
            val re15 = preferences.getString("puzzle15", "defaultValue")
            val re16 = preferences.getString("puzzle16", "defaultValue")
            val re17 = preferences.getString("puzzle17", "defaultValue")
            val re18 = preferences.getString("puzzle18", "defaultValue")
            val re19 = preferences.getString("puzzle19", "defaultValue")
            val re20 = preferences.getString("puzzle20", "defaultValue")
            val re21 = preferences.getString("puzzle21", "defaultValue")
            val re22 = preferences.getString("puzzle22", "defaultValue")
            val re23 = preferences.getString("puzzle23", "defaultValue")
            val re24 = preferences.getString("puzzle24", "defaultValue")
            val re25 = preferences.getString("puzzle25", "defaultValue")
            val re26 = preferences.getString("puzzle26", "defaultValue")
            val re27 = preferences.getString("puzzle27", "defaultValue")
            val re28 = preferences.getString("puzzle28", "defaultValue")
            val re29 = preferences.getString("puzzle29", "defaultValue")
            val re30 = preferences.getString("puzzle30", "defaultValue")
            val re31 = preferences.getString("puzzle31", "defaultValue")
            val re32 = preferences.getString("puzzle32", "defaultValue")
            val re33 = preferences.getString("puzzle33", "defaultValue")
            val re34 = preferences.getString("puzzle34", "defaultValue")
            val re35 = preferences.getString("puzzle35", "defaultValue")
            val re36 = preferences.getString("puzzle36", "defaultValue")
            val re37 = preferences.getString("puzzle37", "defaultValue")
            val re38 = preferences.getString("puzzle38", "defaultValue")
            val re39 = preferences.getString("puzzle39", "defaultValue")
            val re40 = preferences.getString("puzzle40", "defaultValue")
            val re41 = preferences.getString("puzzle41", "defaultValue")
            val re42 = preferences.getString("puzzle42", "defaultValue")
            val re43 = preferences.getString("puzzle43", "defaultValue")
            val re44 = preferences.getString("puzzle44", "defaultValue")
            val re45 = preferences.getString("puzzle45", "defaultValue")
            val re46 = preferences.getString("puzzle46", "defaultValue")
            val re47 = preferences.getString("puzzle47", "defaultValue")
            val re48 = preferences.getString("puzzle48", "defaultValue")
            val re49 = preferences.getString("puzzle49", "defaultValue")
            val re50 = preferences.getString("puzzle50", "defaultValue")
            if (re6 == "six"){
                num = 6
                val level6: ImageView = findViewById(R.id.level6)
                val level6title: TextView = findViewById(R.id.level6title)
                level6.setImageResource(R.drawable.unlocked1)
                level6.translationX = (-120F)
                level6title.translationX = (-120F)
                level7.colorFilter = null
                level7.isEnabled = true
            }
            if (re7 == "seven"){
                num = 7
                val level7title: TextView = findViewById(R.id.level7title)
                level7.setImageResource(R.drawable.unlocked1)
                level7.translationX = (-120F)
                level7title.translationX = (-120F)
                level8.colorFilter = null
                level8.isEnabled = true
            }
            if (re8 == "eight"){
                num = 8
                val level8title: TextView = findViewById(R.id.level8title)
                level8.setImageResource(R.drawable.unlocked1)
                level8.translationX = (-120F)
                level8title.translationX = (-120F)
                level9.colorFilter = null
                level9.isEnabled = true
            }
            if (re9 == "nine"){
                num = 9
                val level9title: TextView = findViewById(R.id.level9title)
                level9.setImageResource(R.drawable.unlocked1)
                level9.translationX = (-120F)
                level9title.translationX = (-120F)
                level10.colorFilter = null
                level10.isEnabled = true
            }
            if (re10 == "ten"){
                num = 10
                val level10title: TextView = findViewById(R.id.level10title)
                level10.setImageResource(R.drawable.unlocked1)
                level10.translationX = (-120F)
                level10title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
            }
            if (re11 == "eleven"){
                num = 11
            }
            if (re12 == "twelve"){
                num = 12
            }
            if (re13 == "thirteen"){
                num = 13
            }
            if (re14 == "fourteen"){
                num = 14
            }
            if (re15 == "fifteen"){
                num = 15
            }
            if (re16 == "sixteen"){
                num = 16
            }
            if (re17 == "seventeen"){
                num = 17
            }
            if (re18 == "eighteen"){
                num = 18
            }
            if (re19 == "nineteen"){
                num = 19
            }
            if (re20 == "twenty"){
                num = 20
            }
            if (re21 == "twenty-one"){
                num = 21
            }
            if (re22 == "twenty-two"){
                num = 22
            }
            if (re23 == "twenty-three"){
                num = 23
            }
            if (re24 == "twenty-four"){
                num = 24
            }
            if (re25 == "twenty-five"){
                num = 25
            }
            if (re26 == "twenty-six"){
                num = 26
            }
            if (re27 == "twenty-seven"){
                num = 27
            }
            if (re28 == "twenty-eight"){
                num = 28
            }
            if (re29 == "twenty-nine"){
                num = 29
            }
            if (re30 == "thirty"){
                num = 30
            }
            if (re31 == "thirty-one"){
                num = 31
            }
            if (re32 == "thirty-two"){
                num = 32
            }
            if (re33 == "thirty-three"){
                num = 33
            }
            if (re34 == "thirty-four"){
                num = 34
            }
            if (re35 == "thirty-five"){
                num = 35
            }
            if (re36 == "thirty-six"){
                num = 36
            }
            if (re37 == "thirty-seven"){
                num = 37
            }
            if (re38 == "thirty-eight"){
                num = 38
            }
            if (re39 == "thirty-nine"){
                num = 39
            }
            if (re40 == "forty"){
                num = 40
            }
            if (re41 == "forty-one"){
                num = 41
            }
            if (re42 == "forty-two"){
                num = 42
            }
            if (re43 == "forty-three"){
                num = 43
            }
            if (re44 == "forty-four"){
                num = 44
            }
            if (re45 == "forty-five"){
                num = 45
            }
            if (re46 == "forty-six"){
                num = 46
            }
            if (re47 == "forty-seven"){
                num = 47
            }
            if (re48 == "forty-eight"){
                num = 48
            }
            if (re49 == "forty-nine"){
                num = 49
            }
            if (re50 == "fifty"){
                num = 50
            }
            many2.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist2, MainActivity::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup2(view: View) {
        val goto = Intent(this@Puzzlelist2, Puzzlelist1::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown2(view: View) {
        val goto = Intent(this@Puzzlelist2, Puzzlelist3::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun levelsix(view: View) {
        val goto = Intent(this@Puzzlelist2, puzzle6::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelseven(view: View) {
        val goto = Intent(this@Puzzlelist2, puzzle7::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveleight(view: View) {
        val goto = Intent(this@Puzzlelist2, puzzle8::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelnine(view: View) {
        val goto = Intent(this@Puzzlelist2, puzzle9::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelten(view: View) {
        val goto = Intent(this@Puzzlelist2, puzzle10::class.java)
        this@Puzzlelist2.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
