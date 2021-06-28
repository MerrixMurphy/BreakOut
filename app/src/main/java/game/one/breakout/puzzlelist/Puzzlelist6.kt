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

class Puzzlelist6 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist6)

        val swipe6: TextView = findViewById(R.id.swipe6)

        var x = false

        swipe6.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist6) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist6, Puzzlelist5::class.java)
                this@Puzzlelist6.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist6, Puzzlelist7::class.java)
                    this@Puzzlelist6.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level27: ImageView = findViewById(R.id.level27)
        level27.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level27.isEnabled = false
        val level28: ImageView = findViewById(R.id.level28)
        level28.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level28.isEnabled = false
        val level29: ImageView = findViewById(R.id.level29)
        level29.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level29.isEnabled = false
        val level30: ImageView = findViewById(R.id.level30)
        level30.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level30.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 25
        val many6: TextView = findViewById(R.id.many6)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "six")
            editor.apply()
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
            if (re26 == "twenty-six"){
                num = 26
                val level26: ImageView = findViewById(R.id.level26)
                val level26title: TextView = findViewById(R.id.level26title)
                level26.setImageResource(R.drawable.unlocked1)
                level26.translationX = (-120F)
                level26title.translationX = (-120F)
                level27.colorFilter = null
                level27.isEnabled = true
            }
            if (re27 == "twenty-seven"){
                num = 27
                val level27title: TextView = findViewById(R.id.level27title)
                level27.setImageResource(R.drawable.unlocked1)
                level27.translationX = (-120F)
                level27title.translationX = (-120F)
                level28.colorFilter = null
                level28.isEnabled = true
            }
            if (re28 == "twenty-eight"){
                num = 28
                val level28title: TextView = findViewById(R.id.level28title)
                level28.setImageResource(R.drawable.unlocked1)
                level28.translationX = (-120F)
                level28title.translationX = (-120F)
                level29.colorFilter = null
                level29.isEnabled = true
            }
            if (re29 == "twenty-nine"){
                num = 29
                val level29title: TextView = findViewById(R.id.level29title)
                level29.setImageResource(R.drawable.unlocked1)
                level29.translationX = (-120F)
                level29title.translationX = (-120F)
                level30.colorFilter = null
                level30.isEnabled = true
            }
            if (re30 == "thirty"){
                num = 30
                val level30title: TextView = findViewById(R.id.level30title)
                level30.setImageResource(R.drawable.unlocked1)
                level30.translationX = (-120F)
                level30title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many6.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist6, MainActivity::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup6(view: View) {
        val goto = Intent(this@Puzzlelist6, Puzzlelist5::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown6(view: View) {
        val goto = Intent(this@Puzzlelist6, Puzzlelist7::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun leveltwentysix(view: View) {
        val goto = Intent(this@Puzzlelist6, puzzle26::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentyseven(view: View) {
        val goto = Intent(this@Puzzlelist6, puzzle27::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentyeight(view: View) {
        val goto = Intent(this@Puzzlelist6, puzzle28::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun leveltwentynine(view: View) {
        val goto = Intent(this@Puzzlelist6, puzzle29::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirty(view: View) {
        val goto = Intent(this@Puzzlelist6, puzzle30::class.java)
        this@Puzzlelist6.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
