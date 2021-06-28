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

class Puzzlelist7 : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzlelist7)

        val swipe7: TextView = findViewById(R.id.swipe7)

        var x = false

        swipe7.setOnTouchListener(object : OnSwipeTouchListener(this@Puzzlelist7) {
            override fun onSwipeDown() {
                super.onSwipeUp()
                val goto = Intent(this@Puzzlelist7, Puzzlelist6::class.java)
                this@Puzzlelist7.startActivity(goto)
                overridePendingTransition(
                    R.anim.slidedownin,
                    R.anim.slideupout
                )
            }
            override fun onSwipeUp() {
                if (x) {
                    super.onSwipeDown()
                    val goto = Intent(this@Puzzlelist7, Puzzlelist8::class.java)
                    this@Puzzlelist7.startActivity(goto)
                    overridePendingTransition(
                        R.anim.slideupin,
                        R.anim.slidedownout
                    )
                }
            }
        })

        val level32: ImageView = findViewById(R.id.level32)
        level32.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level32.isEnabled = false
        val level33: ImageView = findViewById(R.id.level33)
        level33.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level33.isEnabled = false
        val level34: ImageView = findViewById(R.id.level34)
        level34.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level34.isEnabled = false
        val level35: ImageView = findViewById(R.id.level35)
        level35.colorFilter = PorterDuffColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY)
        level35.isEnabled = false
        val godown: ImageView = findViewById(R.id.list2down)
        godown.visibility = View.GONE

        var num = 30
        val many7: TextView = findViewById(R.id.many7)

        val SPLASH_TIME = 0
        android.os.Handler().postDelayed({
            val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
            val editor = preferences.edit()
            editor.putString("levelselect", "seven")
            editor.apply()
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
            if (re31 == "thirty-one"){
                num = 31
                val level31: ImageView = findViewById(R.id.level31)
                val level31title: TextView = findViewById(R.id.level31title)
                level31.setImageResource(R.drawable.unlocked1)
                level31.translationX = (-120F)
                level31title.translationX = (-120F)
                level32.colorFilter = null
                level32.isEnabled = true
            }
            if (re32 == "thirty-two"){
                num = 32
                val level32title: TextView = findViewById(R.id.level32title)
                level32.setImageResource(R.drawable.unlocked1)
                level32.translationX = (-120F)
                level32title.translationX = (-120F)
                level33.colorFilter = null
                level33.isEnabled = true
            }
            if (re33 == "thirty-three"){
                num = 33
                val level33title: TextView = findViewById(R.id.level33title)
                level33.setImageResource(R.drawable.unlocked1)
                level33.translationX = (-120F)
                level33title.translationX = (-120F)
                level34.colorFilter = null
                level34.isEnabled = true
            }
            if (re34 == "thirty-four"){
                num = 34
                val level34title: TextView = findViewById(R.id.level34title)
                level34.setImageResource(R.drawable.unlocked1)
                level34.translationX = (-120F)
                level34title.translationX = (-120F)
                level35.colorFilter = null
                level35.isEnabled = true
            }
            if (re35 == "thirty-five"){
                num = 35
                val level35title: TextView = findViewById(R.id.level35title)
                level35.setImageResource(R.drawable.unlocked1)
                level35.translationX = (-120F)
                level35title.translationX = (-120F)
                godown.visibility = View.VISIBLE
                x=true
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
            many7.text = "$num/50 Locks Unlocked"
        }, SPLASH_TIME.toLong())
    }

    override fun onBackPressed() {
        val goto = Intent(this@Puzzlelist7, MainActivity::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun goup7(view: View) {
        val goto = Intent(this@Puzzlelist7, Puzzlelist6::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.slidedownin,
            R.anim.slideupout
        )
    }

    fun godown7(view: View) {
        val goto = Intent(this@Puzzlelist7, Puzzlelist8::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.slideupin,
            R.anim.slidedownout
        )
    }

    fun levelthirtyone(view: View) {
        val goto = Intent(this@Puzzlelist7, puzzle31::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtytwo(view: View) {
        val goto = Intent(this@Puzzlelist7, puzzle32::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtythree(view: View) {
        val goto = Intent(this@Puzzlelist7, puzzle33::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtyfour(view: View) {
        val goto = Intent(this@Puzzlelist7, puzzle34::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }

    fun levelthirtyfive(view: View) {
        val goto = Intent(this@Puzzlelist7, puzzle35::class.java)
        this@Puzzlelist7.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}
