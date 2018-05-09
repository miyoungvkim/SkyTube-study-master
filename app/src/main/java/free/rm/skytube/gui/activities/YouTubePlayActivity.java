/*
 * SkyTube
 * Copyright (C) 2016  Ramon Mifsud
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation (version 3 of the License).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package free.rm.skytube.gui.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import free.rm.skytube.R;
import free.rm.skytube.gui.fragments.YouTubePlayerFragment;

/**
 * An {@link Activity} that contains an instance of
 * {@link YouTubePlayerFragment}.
 */
public class YouTubePlayActivity extends AppCompatActivity {

	private static final String TAG = "TAG";

	@Override
	protected void onCreate(Bundle savedInstanceState)  {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.youtube_play_activity );

		Log.d(TAG," "+new Throwable().getStackTrace()[0].getMethodName()+"()"+"#"+new Throwable().getStackTrace()[0].getLineNumber());

	}

}
