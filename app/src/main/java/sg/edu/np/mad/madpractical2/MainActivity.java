package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user1 = new User("Addison", "Y2 IT Student", 1, false);

        // Get button
        Button followButton = findViewById(R.id.followButton);

        // Check if user is following
        if (user1.followed){
            followButton.setText("Unfollow");
        }

        // Set onClickListener for Follow Button to update text
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.followed){
                    user1.followed = false;
                    followButton.setText("Follow");
                } else {
                    user1.followed = true;
                    followButton.setText("Unfollow");
                }
            }
        });
    }
}