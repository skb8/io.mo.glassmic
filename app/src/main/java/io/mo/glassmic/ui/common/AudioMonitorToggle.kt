package io.mo.glassmic.ui.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import io.mo.glassmic.R

/** Shared settings-style control for local playback on the current audio output. */
@Composable
fun AudioMonitorToggle(checked: Boolean, onToggle: () -> Unit) {
    ToggleRow(
        title = stringResource(R.string.audio_monitor_local_playback),
        checked = checked,
        onChange = { onToggle() }
    )
}
