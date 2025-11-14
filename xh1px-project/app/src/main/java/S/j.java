package S;

import P.C0258f;
import P.InterfaceC0257e;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {
    public static C0258f a(View view, C0258f c0258f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0258f);
        }
        InterfaceC0257e interfaceC0257e = c0258f.f4266a;
        if (interfaceC0257e.h() == 2) {
            return c0258f;
        }
        ClipData a3 = interfaceC0257e.a();
        int c6 = interfaceC0257e.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i4 = 0; i4 < a3.getItemCount(); i4++) {
            ClipData.Item itemAt = a3.getItemAt(i4);
            if ((c6 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z8) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z8 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
