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

class Puzzlelist5 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist5)

        val swipe5: TextView = findViewById(R.id.swipe5)

        var x = false

        swipe5.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist5) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist5, Puzzlelist4::class.java)
                this@Puzzlelist5.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist5, Puzzlelist6::class.java)
                    this@Puzzlelist5.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level22: ImageView = findViewById(R.id.level22)
        level22.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level22.isEnabled = false
        val level23: ImageView = findViewById(R.id.level23)
        level23.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level23.isEnabled = false
        val level24: ImageView = findViewById(R.id.level24)
        level24.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level24.isEnabled = false
        val level25: ImageView = findViewById(R.id.level25)
        level25.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level25.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 20
        val many5: TextView = findViewById(R.id.many5)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "five")
            editor.apply()
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
            if (re21 == "twenty-one"){
                num = 21
                val level21: ImageView = findViewById(R.id.level21)
                val level21title: TextView = findViewById(R.id.level21title)
                level21.setImageResource(R.drawable.unlocked1)
                level21.translationX = (-120F)
                level21title.translationX = (-120F)
                level22.colorFilter = null
                level22.isEnabled = true
            }
            if (re22 == "twenty-two"){
                num = 22
                val level22title: TextView = findViewById(R.id.level22title)
                level22.setImageResource(R.drawable.unlocked1)
                level22.translationX = (-120F)
                level22title.translationX = (-120F)
                level23.colorFilter = null
                level23.isEnabled = true
            }
            if (re23 == "twenty-three"){
                num = 23
                val level23title: TextView = findViewById(R.id.level23title)
                level23.setImageResource(R.drawable.unlocked1)
                level23.translationX = (-120F)
                level23title.translationX = (-120F)
                level24.colorFilter = null
                level24.isEnabled = true
            }
            if (re24 == "twenty-four"){
                num = 24
                val level24title: TextView = findViewById(R.id.level24title)
                level24.setImageResource(R.drawable.unlocked1)
                level24.translationX = (-120F)
                level24title.translationX = (-120F)
                level25.colorFilter = null
                level25.isEnabled = true
            }
            if (re25 == "twenty-five"){
                num = 25
                val level25title: TextView = findViewById(R.id.level25title)
                level25.setImageResource(R.drawable.unlocked1)
                level25.translationX = (-120F)
                level25title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many5.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist5, MainActivity::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup5(view: View) {
        val goto = Intent(this@Puzzlelist5, Puzzlelist4::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown5(view: View) {
        val goto = Intent(this@Puzzlelist5, Puzzlelist6::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun leveltwentyone(view: View) {
        val goto = Intent(this@Puzzlelist5, puzzle21::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentytwo(view: View) {
        val goto = Intent(this@Puzzlelist5, puzzle22::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentythree(view: View) {
        val goto = Intent(this@Puzzlelist5, puzzle23::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentyfour(view: View) {
        val goto = Intent(this@Puzzlelist5, puzzle24::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentyfive(view: View) {
        val goto = Intent(this@Puzzlelist5, puzzle25::class.java)
        this@Puzzlelist5.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
