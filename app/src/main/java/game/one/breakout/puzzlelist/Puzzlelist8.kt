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

class Puzzlelist8 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist8)

        val swipe8: TextView = findViewById(R.id.swipe8)

        var x = false

        swipe8.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist8) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist8, Puzzlelist7::class.java)
                this@Puzzlelist8.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist8, Puzzlelist9::class.java)
                    this@Puzzlelist8.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level37: ImageView = findViewById(R.id.level37)
        level37.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level37.isEnabled = false
        val level38: ImageView = findViewById(R.id.level38)
        level38.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level38.isEnabled = false
        val level39: ImageView = findViewById(R.id.level39)
        level39.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level39.isEnabled = false
        val level40: ImageView = findViewById(R.id.level40)
        level40.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level40.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 35
        val many8: TextView = findViewById(R.id.many8)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "eight")
            editor.apply()
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
            if (re36 == "thirty-six"){
                num = 36
                val level36: ImageView = findViewById(R.id.level36)
                val level36title: TextView = findViewById(R.id.level36title)
                level36.setImageResource(R.drawable.unlocked1)
                level36.translationX = (-120F)
                level36title.translationX = (-120F)
                level37.colorFilter = null
                level37.isEnabled = true
            }
            if (re37 == "thirty-seven"){
                num = 37
                val level37title: TextView = findViewById(R.id.level37title)
                level37.setImageResource(R.drawable.unlocked1)
                level37.translationX = (-120F)
                level37title.translationX = (-120F)
                level38.colorFilter = null
                level38.isEnabled = true
            }
            if (re38 == "thirty-eight"){
                num = 38
                val level38title: TextView = findViewById(R.id.level38title)
                level38.setImageResource(R.drawable.unlocked1)
                level38.translationX = (-120F)
                level38title.translationX = (-120F)
                level39.colorFilter = null
                level39.isEnabled = true
            }
            if (re39 == "thirty-nine"){
                num = 39
                val level39title: TextView = findViewById(R.id.level39title)
                level39.setImageResource(R.drawable.unlocked1)
                level39.translationX = (-120F)
                level39title.translationX = (-120F)
                level40.colorFilter = null
                level40.isEnabled = true
            }
            if (re40 == "forty"){
                num = 40
                val level40title: TextView = findViewById(R.id.level40title)
                level40.setImageResource(R.drawable.unlocked1)
                level40.translationX = (-120F)
                level40title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many8.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist8, MainActivity::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup8(view: View) {
        val goto = Intent(this@Puzzlelist8, Puzzlelist7::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown8(view: View) {
        val goto = Intent(this@Puzzlelist8, Puzzlelist9::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun levelthirtysix(view: View) {
        val goto = Intent(this@Puzzlelist8, puzzle36::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtyseven(view: View) {
        val goto = Intent(this@Puzzlelist8, puzzle37::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtyeight(view: View) {
        val goto = Intent(this@Puzzlelist8, puzzle38::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtynine(view: View) {
        val goto = Intent(this@Puzzlelist8, puzzle39::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelforty(view: View) {
        val goto = Intent(this@Puzzlelist8, puzzle40::class.java)
        this@Puzzlelist8.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
