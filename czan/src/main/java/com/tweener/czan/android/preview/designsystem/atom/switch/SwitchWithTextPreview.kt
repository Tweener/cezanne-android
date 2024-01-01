package com.tweener.czan.android.preview.designsystem.atom.switch

import androidx.compose.runtime.Composable
import com.tweener.czan.android.preview.UiModePreviews
import com.tweener.czan.designsystem.atom.switch.SwitchWithText
import com.tweener.czan.preview.CzanThemePreview

/**
 * @author Vivien Mahe
 * @since 01/01/2024
 */

@UiModePreviews
@Composable
private fun SwitchWithTextCheckedPreview() {
    CzanThemePreview {
        SwitchWithText(text = "Switch checked with text", isChecked = true)
    }
}

@UiModePreviews
@Composable
private fun SwitchWithTextNotCheckedPreview() {
    CzanThemePreview {
        SwitchWithText(text = "Switch not checked with text", isChecked = false)
    }
}
