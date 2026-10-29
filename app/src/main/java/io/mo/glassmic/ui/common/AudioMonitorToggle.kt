package io.mo.glassmic.ui.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.mo.glassmic.R

/** One shared, independently toggleable radio control for local monitoring. */
@Composable
fun AudioMonitorToggle(checked: Boolean, onToggle: () -> Unit) {
    Row(
        Modifier.fillMaxWidth().heightIn(min = 48.dp)
            .toggleable(value = checked, role = Role.Checkbox, onValueChange = { onToggle() })
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = checked,
            onClick = null,
            colors = RadioButtonDefaults.colors(
                selectedColor = glass.primaryInk,
                unselectedColor = glass.ink3
            )
        )
        Text(
            stringResource(R.string.audio_monitor_speaker),
            modifier = Modifier.padding(start = 10.dp),
            fontSize = 13.sp,
            color = glass.ink
        )
    }
}
