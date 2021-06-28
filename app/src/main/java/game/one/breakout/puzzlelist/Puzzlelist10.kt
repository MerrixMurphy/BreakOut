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

class Puzzlelist10 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist10)

        val swipe10: TextView = findViewById(R.id.swipe10)

        swipe10.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist10) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist10, Puzzlelist9::class.java)
                this@Puzzlelist10.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
        })

        val level47: ImageView = findViewById(R.id.level47)
        level47.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level47.isEnabled = false
        val level48: ImageView = findViewById(R.id.level48)
        level48.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level48.isEnabled = false
        val level49: ImageView = findViewById(R.id.level49)
        level49.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level49.isEnabled = false
        val level50: ImageView = findViewById(R.id.level50)
        level50.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level50.isEnabled = false

        var num = 45
        val many10: TextView = findViewById(R.id.many10)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "ten")
            editor.apply()
            val re46 = preferences.getString("puzzle46", "defaultValue")
            val re47 = preferences.getString("puzzle47", "defaultValue")
            val re48 = preferences.getString("puzzle48", "defaultValue")
            val re49 = preferences.getString("puzzle49", "defaultValue")
            val re50 = preferences.getString("puzzle50", "defaultValue")
            if (re46 == "forty-six"){
                num = 46
                val level46: ImageView = findViewById(R.id.level46)
                val level46title: TextView = findViewById(R.id.level46title)
                level46.setImageResource(R.drawable.unlocked1)
                level46.translationX = (-120F)
                level46title.translationX = (-120F)
                level47.colorFilter = null
                level47.isEnabled = true
            }
            if (re47 == "forty-seven"){
                num = 47
                val level47title: TextView = findViewById(R.id.level47title)
                level47.setImageResource(R.drawable.unlocked1)
                level47.translationX = (-120F)
                level47title.translationX = (-120F)
                level48.colorFilter = null
                level48.isEnabled = true
            }
            if (re48 == "forty-eight"){
                num = 48
                val level48title: TextView = findViewById(R.id.level48title)
                level48.setImageResource(R.drawable.unlocked1)
                level48.translationX = (-120F)
                level48title.translationX = (-120F)
                level49.colorFilter = null
                level49.isEnabled = true
            }
            if (re49 == "forty-nine"){
                num = 49
                val level49title: TextView = findViewById(R.id.level49title)
                level49.setImageResource(R.drawable.unlocked1)
                level49.translationX = (-120F)
                level49title.translationX = (-120F)
                level50.colorFilter = null
                level50.isEnabled = true
            }
            if (re50 == "fifty"){
                num = 50
                val level50title: TextView = findViewById(R.id.level50title)
                level50.setImageResource(R.drawable.unlocked1)
                level50.translationX = (-120F)
                level50title.translationX = (-120F)
            }
            many10.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist10, MainActivity::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup10(view: View) {
        val goto = Intent(this@Puzzlelist10, Puzzlelist9::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun levelfortysix(view: View) {
        val goto = Intent(this@Puzzlelist10, puzzle46::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortyseven(view: View) {
        val goto = Intent(this@Puzzlelist10, puzzle47::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortyeight(view: View) {
        val goto = Intent(this@Puzzlelist10, puzzle48::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfortynine(view: View) {
        val goto = Intent(this@Puzzlelist10, puzzle49::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelfifty(view: View) {
        val goto = Intent(this@Puzzlelist10, puzzle50::class.java)
        this@Puzzlelist10.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
