package game.one.breakout

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {

    private val SPLASH_TIME = 3000
    private var ProgressStatus = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val Break: TextView = findViewById(R.id.breaktitle)
        val out: TextView = findViewById(R.id.out)
        val breakone: TextView = findViewById(R.id.breaklock1)
        val breaktwo: TextView = findViewById(R.id.breaklock2)
        val hide1: ImageView = findViewById(R.id.hideone)
        val hide2: ImageView = findViewById(R.id.hidetwo)
        val circle: ImageView = findViewById(R.id.circle)

        val breakslide: Animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.breakslide
        )
        val outslide: Animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.outslide
        )

        Thread(Runnable {
            var x = 1
            while (ProgressStatus < 100) {
                ProgressStatus++
                x++
                if(x == 50){
                    Break.startAnimation(breakslide)
                    breakone.startAnimation(breakslide)
                    breaktwo.startAnimation(breakslide)
                    hide1.startAnimation(breakslide)
                    hide2.startAnimation(breakslide)
                    out.startAnimation(outslide)
                    circle.startAnimation(outslide)
                    breakslide.fillAfter = true
                    outslide.fillAfter = true
                }
                SystemClock.sleep(30)
            }
        }).start()

        android.os.Handler().postDelayed({
            val load = Intent(this@Splash, MainActivity::class.java)
            startActivity(load)
            overridePendingTransition(R.anim.zoomin, R.anim.zoomout)
        }, SPLASH_TIME.toLong())
    }
}
