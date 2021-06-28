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

class Puzzlelist9 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist9)

        val swipe9: TextView = findViewById(R.id.swipe9)

        var x = false

        swipe9.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist9) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist9, Puzzlelist8::class.java)
                this@Puzzlelist9.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist9, Puzzlelist10::class.java)
                    this@Puzzlelist9.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level42: ImageView = findViewById(R.id.level42)
        level42.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level42.isEnabled = false
        val level43: ImageView = findViewById(R.id.level43)
        level43.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level43.isEnabled = false
        val level44: ImageView = findViewById(R.id.level44)
        level44.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level44.isEnabled = false
        val level45: ImageView = findViewById(R.id.level45)
        level45.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level45.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 40
        val many9: TextView = findViewById(R.id.many9)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "nine")
            editor.apply()
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
            if (re41 == "forty-one"){
                num = 41
                val level41: ImageView = findViewById(R.id.level41)
                val level41title: TextView = findViewById(R.id.level41title)
                level41.setImageResource(R.drawable.unlocked1)
                level41.translationX = (-120F)
                level41title.translationX = (-120F)
                level42.colorFilter = null
                level42.isEnabled = true
            }
            if (re42 == "forty-two"){
                num = 42
                val level42title: TextView = findViewById(R.id.level42title)
                level42.setImageResource(R.drawable.unlocked1)
                level42.translationX = (-120F)
                level42title.translationX = (-120F)
                level43.colorFilter = null
                level43.isEnabled = true
            }
            if (re43 == "forty-three"){
                num = 43
                val level43title: TextView = findViewById(R.id.level43title)
                level43.setImageResource(R.drawable.unlocked1)
                level43.translationX = (-120F)
                level43title.translationX = (-120F)
                level44.colorFilter = null
                level44.isEnabled = true
            }
            if (re44 == "forty-four"){
                num = 44
                val level44title: TextView = findViewById(R.id.level44title)
                level44.setImageResource(R.drawable.unlocked1)
                level44.translationX = (-120F)
                level44title.translationX = (-120F)
                level45.colorFilter = null
                level45.isEnabled = true
            }
            if (re45 == "forty-five"){
                num = 45
                val level45title: TextView = findViewById(R.id.level45title)
                level45.setImageResource(R.drawable.unlocked1)
                level45.translationX = (-120F)
                level45title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many9.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist9, MainActivity::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup9(view: View) {
        val goto = Intent(this@Puzzlelist9, Puzzlelist8::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown9(view: View) {
        val goto = Intent(this@Puzzlelist9, Puzzlelist10::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun levelfortyone(view: View) {
        val goto = Intent(this@Puzzlelist9, puzzle41::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortytwo(view: View) {
        val goto = Intent(this@Puzzlelist9, puzzle42::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortythree(view: View) {
        val goto = Intent(this@Puzzlelist9, puzzle43::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortyfour(view: View) {
        val goto = Intent(this@Puzzlelist9, puzzle44::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortyfive(view: View) {
        val goto = Intent(this@Puzzlelist9, puzzle45::class.java)
        this@Puzzlelist9.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
