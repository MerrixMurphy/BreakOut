package game.one.breakout.puzzles

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdCallback
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import game.one.breakout.OnSwipeTouchListener
import game.one.breakout.R
import game.one.breakout.puzzlelist.Puzzlelist4

class puzzle19 : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle19)

        val v: TextView = findViewById(R.id.vnineteen)
        val preferences = getSharedPreferences("puz", Context.MODE_PRIVATE)
        val editor = preferences.edit()

        val one: TextView = findViewById(R.id.one19)
        val one2: TextView = findViewById(R.id.one219)
        val two: TextView = findViewById(R.id.two19)
        val two2: TextView = findViewById(R.id.two219)
        val three: TextView = findViewById(R.id.three19)
        val three2: TextView = findViewById(R.id.three219)
        val four: TextView = findViewById(R.id.four19)
        val four2: TextView = findViewById(R.id.four219)
        val five: TextView = findViewById(R.id.five19)
        val five2: TextView = findViewById(R.id.five219)
        val enter: Button = findViewById(R.id.button19)
        val lockbase: TextView = findViewById(R.id.lockbase19)
        val backlock: ImageView = findViewById(R.id.backlock19)
        val topnode: TextView = findViewById(R.id.topnode19)
        val botnode: TextView = findViewById(R.id.botnode19)
        var clicks1 = 0
        var clicks2 = 0
        var clicks3 = 0
        var clicks4 = 0
        var clicks5 = 0
        val code1 = 0
        val code2 = 0
        val code3 = 0
        val code4 = 0
        val code5 = 0
        val slidedown: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.slidedown
        )
        val slideup: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.slideup
        )
        val slidedown2: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.slidedown2
        )
        val slideup2: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.slideup2
        )
        val slideleft: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.slideleft
        )
        val fadein: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.fadein
        )
        val userbutton1: Button = findViewById(R.id.userbutton19)
        val user1: TextView = findViewById(R.id.user19)
        val handler = Handler()
        val hint1: TextView = findViewById(R.id.hint19)
        val back1: ImageView = findViewById(R.id.back19)

        back1.isEnabled = false
        hint1.isEnabled = false
        one.isEnabled = false
        two.isEnabled = false
        three.isEnabled = false
        four.isEnabled = false
        five.isEnabled = false
        enter.isEnabled = false
        userbutton1.startAnimation(fadein)
        user1.startAnimation(fadein)
        userbutton1.visibility = View.VISIBLE
        user1.visibility = View.VISIBLE
        user1.text = "Title"

        MobileAds.initialize(this) {
        }
        val rewardedAd = RewardedAd(this, "ca-app-pub-3940256099942544/5224354917")

        val adLoadCallback = object: RewardedAdLoadCallback() {
            override fun onRewardedAdLoaded() {
                // Ad successfully loaded.
            }
            override fun onRewardedAdFailedToLoad(errorCode: Int) {
                // Ad failed to load.
            }
        }
        rewardedAd.loadAd(AdRequest.Builder().build(), adLoadCallback)

        var watch = false

        hint1.setOnClickListener(){
            if (rewardedAd.isLoaded) {
                val adCallback = object: RewardedAdCallback() {
                    override fun onRewardedAdOpened() {
                        // Ad opened.
                    }
                    override fun onRewardedAdClosed() {
                        // Ad closed.
                    }
                    override fun onUserEarnedReward(@NonNull reward: RewardItem) {
                        back1.isEnabled = false
                        hint1.isEnabled = false
                        one.isEnabled = false
                        two.isEnabled = false
                        three.isEnabled = false
                        four.isEnabled = false
                        five.isEnabled = false
                        enter.isEnabled = false
                        userbutton1.visibility = View.VISIBLE
                        user1.visibility = View.VISIBLE
                        user1.text = "Hint"
                        watch = true
                        // User earned reward.
                    }
                    override fun onRewardedAdFailedToShow(errorCode: Int) {
                        // Ad failed to display.
                    }
                }
                rewardedAd.show(this, adCallback)
            } else {
                Log.d("TAG", "The rewarded ad wasn't loaded yet.")
            }
            if(watch == true){
                back1.isEnabled = false
                hint1.isEnabled = false
                one.isEnabled = false
                two.isEnabled = false
                three.isEnabled = false
                four.isEnabled = false
                five.isEnabled = false
                enter.isEnabled = false
                userbutton1.visibility = View.VISIBLE
                user1.visibility = View.VISIBLE
                user1.text = "Hint"
            }
        }

        one.setOnTouchListener(object : OnSwipeTouchListener(this@puzzle19) {
            override fun onSwipeUp() {
                super.onSwipeUp()
                one2.startAnimation(slidedown2)
                one.startAnimation(slideup2)
                if (clicks1 > 0) {
                    clicks1--
                    val oldclick1 = clicks1+1
                    one.text = (+clicks1).toString()
                    one2.text = (+oldclick1).toString()
                } else {
                    clicks1 = 9
                    val oldclick1 = 0
                    one.text = (+clicks1).toString()
                    one2.text = (+oldclick1).toString()
                }
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                one.startAnimation(slidedown)
                one2.startAnimation(slideup)
                if (clicks1 < 9) {
                    clicks1++
                    val oldclick1 = clicks1-1
                    one.text = (+clicks1).toString()
                    one2.text = (+oldclick1).toString()
                } else {
                    clicks1 = 0
                    val oldclick1 = 9
                    one.text = (+clicks1).toString()
                    one2.text = (+oldclick1).toString()
                }
            }
        })

        two.setOnTouchListener(object : OnSwipeTouchListener(this@puzzle19) {
            override fun onSwipeUp() {
                super.onSwipeUp()
                two2.startAnimation(slidedown2)
                two.startAnimation(slideup2)
                if (clicks2 > 0) {
                    clicks2--
                    val oldclick2 = clicks2+1
                    two.text = (+clicks2).toString()
                    two2.text = (+oldclick2).toString()
                } else {
                    clicks2 = 9
                    val oldclick2 = 0
                    two.text = (+clicks2).toString()
                    two2.text = (+oldclick2).toString()
                }
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                two.startAnimation(slidedown)
                two2.startAnimation(slideup)
                if (clicks2 < 9) {
                    clicks2++
                    val oldclick2 = clicks2-1
                    two.text = (+clicks2).toString()
                    two2.text = (+oldclick2).toString()
                } else {
                    clicks2 = 0
                    val oldclick2 = 9
                    two.text = (+clicks2).toString()
                    two2.text = (+oldclick2).toString()
                }
            }
        })

        three.setOnTouchListener(object : OnSwipeTouchListener(this@puzzle19) {
            override fun onSwipeUp() {
                super.onSwipeUp()
                three2.startAnimation(slidedown2)
                three.startAnimation(slideup2)
                if (clicks3 > 0) {
                    clicks3--
                    val oldclick3 = clicks3+1
                    three.text = (+clicks3).toString()
                    three2.text = (+oldclick3).toString()
                } else {
                    clicks3 = 9
                    val oldclick3 = 0
                    three.text = (+clicks3).toString()
                    three2.text = (+oldclick3).toString()
                }
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                three.startAnimation(slidedown)
                three2.startAnimation(slideup)
                if (clicks3 < 9) {
                    clicks3++
                    val oldclick3 = clicks3-1
                    three.text = (+clicks3).toString()
                    three2.text = (+oldclick3).toString()
                } else {
                    clicks3 = 0
                    val oldclick3 = 9
                    three.text = (+clicks3).toString()
                    three2.text = (+oldclick3).toString()
                }
            }
        })

        four.setOnTouchListener(object : OnSwipeTouchListener(this@puzzle19) {
            override fun onSwipeUp() {
                super.onSwipeUp()
                four2.startAnimation(slidedown2)
                four.startAnimation(slideup2)
                if (clicks4 > 0) {
                    clicks4--
                    val oldclick4 = clicks4+1
                    four.text = (+clicks4).toString()
                    four2.text = (+oldclick4).toString()
                } else {
                    clicks4 = 9
                    val oldclick4 = 0
                    four.text = (+clicks4).toString()
                    four2.text = (+oldclick4).toString()
                }
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                four.startAnimation(slidedown)
                four2.startAnimation(slideup)
                if (clicks4 < 9) {
                    clicks4++
                    val oldclick4 = clicks4-1
                    four.text = (+clicks4).toString()
                    four2.text = (+oldclick4).toString()
                } else {
                    clicks4 = 0
                    val oldclick4 = 9
                    four.text = (+clicks4).toString()
                    four2.text = (+oldclick4).toString()
                }
            }
        })

        five.setOnTouchListener(object : OnSwipeTouchListener(this@puzzle19) {
            override fun onSwipeUp() {
                super.onSwipeUp()
                five2.startAnimation(slidedown2)
                five.startAnimation(slideup2)
                if (clicks5 > 0) {
                    clicks5--
                    val oldclick5 = clicks5+1
                    five.text = (+clicks5).toString()
                    five2.text = (+oldclick5).toString()
                } else {
                    clicks5 = 9
                    val oldclick5 = 0
                    five.text = (+clicks5).toString()
                    five2.text = (+oldclick5).toString()
                }
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                five.startAnimation(slidedown)
                five2.startAnimation(slideup)
                if (clicks5 < 9) {
                    clicks5++
                    val oldclick5 = clicks5-1
                    five.text = (+clicks5).toString()
                    five2.text = (+oldclick5).toString()
                } else {
                    clicks5 = 0
                    val oldclick5 = 9
                    five.text = (+clicks5).toString()
                    five2.text = (+oldclick5).toString()
                }
            }
        })

        var right = false

        enter.setOnClickListener {
            if (clicks1 == code1 && clicks2 == code2 && clicks3 == code3 && clicks4 == code4 && clicks5 == code5) {
                back1.isEnabled = false
                hint1.isEnabled = false
                one.isEnabled = false
                two.isEnabled = false
                three.isEnabled = false
                four.isEnabled = false
                five.isEnabled = false
                enter.isEnabled = false
                two.startAnimation(slideleft)
                three.startAnimation(slideleft)
                two2.startAnimation(slideleft)
                three2.startAnimation(slideleft)
                one.startAnimation(slideleft)
                one2.startAnimation(slideleft)
                five.startAnimation(slideleft)
                five2.startAnimation(slideleft)
                four.startAnimation(slideleft)
                four2.startAnimation(slideleft)
                lockbase.startAnimation(slideleft)
                backlock.startAnimation(slideleft)
                topnode.startAnimation(slideleft)
                botnode.startAnimation(slideleft)
                slideleft.setFillAfter(true)
                v.text = "nineteen"
                editor.putString("puzzle19", v.text.toString())
                editor.apply()
                handler.postDelayed({
                    userbutton1.visibility = View.VISIBLE
                    user1.visibility = View.VISIBLE
                    user1.text = "Right"
                }, 1000)
                right = true
            } else {
                back1.isEnabled = false
                hint1.isEnabled = false
                one.isEnabled = false
                two.isEnabled = false
                three.isEnabled = false
                four.isEnabled = false
                five.isEnabled = false
                enter.isEnabled = false
                userbutton1.visibility = View.VISIBLE
                user1.visibility = View.VISIBLE
                user1.text = "Wrong"
            }
        }
        userbutton1.setOnClickListener {
            val fadeout: Animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadeout
            )
            userbutton1.startAnimation(fadeout)
            user1.startAnimation(fadeout)
            back1.isEnabled = true
            hint1.isEnabled = true
            one.isEnabled = true
            two.isEnabled = true
            three.isEnabled = true
            four.isEnabled = true
            five.isEnabled = true
            enter.isEnabled = true
            userbutton1.visibility = View.GONE
            user1.visibility = View.GONE
            if(right == true) {
                val goto = Intent(this@puzzle19, Puzzlelist4::class.java)
                this@puzzle19.startActivity(goto)
                overridePendingTransition(
                    R.anim.zoomin,
                    R.anim.zoomout
                )
            }
        }
        back1.setOnClickListener() {
            val goto = Intent(this@puzzle19, Puzzlelist4::class.java)
            this@puzzle19.startActivity(goto)
            overridePendingTransition(
                R.anim.zoomin,
                R.anim.zoomout
            )
        }
    }

    override fun onBackPressed() {
        val goto = Intent(this@puzzle19, Puzzlelist4::class.java)
        this@puzzle19.startActivity(goto)
        overridePendingTransition(
            R.anim.zoomin,
            R.anim.zoomout
        )
    }
}