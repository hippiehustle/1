package e0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import c0.k;
import d0.C0593b;
import java.nio.ByteBuffer;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f10578a;

    /* renamed from: b, reason: collision with root package name */
    public final G5.e f10579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i4;
        G5.e eVar = new G5.e(20);
        this.f10578a = editText;
        this.f10579b = eVar;
        if (k.k != null) {
            k a3 = k.a();
            if (a3.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            c0.f fVar = a3.f9389e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            C0593b c0593b = (C0593b) fVar.f9381c.f280e;
            int b4 = c0593b.b(4);
            if (b4 != 0) {
                i4 = ((ByteBuffer) c0593b.f4206g).getInt(b4 + c0593b.f4203d);
            } else {
                i4 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i4);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i8) {
        Editable editableText = this.f10578a.getEditableText();
        this.f10579b.getClass();
        if (!G5.e.u(this, editableText, i4, i8, false) && !super.deleteSurroundingText(i4, i8)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i8) {
        Editable editableText = this.f10578a.getEditableText();
        this.f10579b.getClass();
        if (G5.e.u(this, editableText, i4, i8, true) || super.deleteSurroundingTextInCodePoints(i4, i8)) {
            return true;
        }
        return false;
    }
}
