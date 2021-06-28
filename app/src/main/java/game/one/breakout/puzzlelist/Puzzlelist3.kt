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

class Puzzlelist3 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist3)

        val swipe3: TextView = findViewById(R.id.swipe3)

        var x = false

        swipe3.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist3) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist3, Puzzlelist2::class.java)
                this@Puzzlelist3.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist3, Puzzlelist4::class.java)
                    this@Puzzlelist3.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level12: ImageView = findViewById(R.id.level12)
        level12.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level12.isEnabled = false
        val level13: ImageView = findViewById(R.id.level13)
        level13.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level13.isEnabled = false
        val level14: ImageView = findViewById(R.id.level14)
        level14.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level14.isEnabled = false
        val level15: ImageView = findViewById(R.id.level15)
        level15.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level15.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 10
        val many3: TextView = findViewById(R.id.many3)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "three")
            editor.apply()
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
            if (re11 == "eleven"){
                num = 11
                val level11: ImageView = findViewById(R.id.level11)
                val level11title: TextView = findViewById(R.id.level11title)
                level11.setImageResource(R.drawable.unlocked1)
                level11.translationX = (-120F)
                level11title.translationX = (-120F)
                level12.colorFilter = null
                level12.isEnabled = true
            }
            if (re12 == "twelve"){
                num = 12
                val level12title: TextView = findViewById(R.id.level12title)
                level12.setImageResource(R.drawable.unlocked1)
                level12.translationX = (-120F)
                level12title.translationX = (-120F)
                level13.colorFilter = null
                level13.isEnabled = true
            }
            if (re13 == "thirteen"){
                num = 13
                val level13title: TextView = findViewById(R.id.level13title)
                level13.setImageResource(R.drawable.unlocked1)
                level13.translationX = (-120F)
                level13title.translationX = (-120F)
                level14.colorFilter = null
                level14.isEnabled = true
            }
            if (re14 == "fourteen"){
                num = 14
                val level14title: TextView = findViewById(R.id.level14title)
                level14.setImageResource(R.drawable.unlocked1)
                level14.translationX = (-120F)
                level14title.translationX = (-120F)
                level15.colorFilter = null
                level15.isEnabled = true
            }
            if (re15 == "fifteen"){
                num = 15
                val level15title: TextView = findViewById(R.id.level15title)
                level15.setImageResource(R.drawable.unlocked1)
                level15.translationX = (-120F)
                level15title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many3.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist3, MainActivity::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup3(view: View) {
        val goto = Intent(this@Puzzlelist3, Puzzlelist2::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown3(view: View) {
        val goto = Intent(this@Puzzlelist3, Puzzlelist4::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun leveleleven(view: View) {
        val goto = Intent(this@Puzzlelist3, puzzle11::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwelve(view: View) {
        val goto = Intent(this@Puzzlelist3, puzzle12::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirteen(view: View) {
        val goto = Intent(this@Puzzlelist3, puzzle13::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfourteen(view: View) {
        val goto = Intent(this@Puzzlelist3, puzzle14::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfifteen(view: View) {
        val goto = Intent(this@Puzzlelist3, puzzle15::class.java)
        this@Puzzlelist3.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
