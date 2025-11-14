package o;

import P.C0256d;
import P.C0258f;
import P.InterfaceC0255c;
import P.InterfaceC0269q;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;

/* renamed from: o.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1220w extends EditText implements InterfaceC0269q {

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13401d;

    /* renamed from: e, reason: collision with root package name */
    public final W f13402e;

    /* renamed from: f, reason: collision with root package name */
    public final C1174B f13403f;

    /* renamed from: g, reason: collision with root package name */
    public final S.j f13404g;

    /* renamed from: h, reason: collision with root package name */
    public final C1174B f13405h;

    /* renamed from: i, reason: collision with root package name */
    public C1218v f13406i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, S.j] */
    public C1220w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        b1.a(context);
        a1.a(this, getContext());
        C1207p c1207p = new C1207p(this);
        this.f13401d = c1207p;
        c1207p.k(attributeSet, R.attr.editTextStyle);
        W w8 = new W(this);
        this.f13402e = w8;
        w8.f(attributeSet, R.attr.editTextStyle);
        w8.b();
        C1174B c1174b = new C1174B();
        c1174b.f13041b = this;
        this.f13403f = c1174b;
        this.f13404g = new Object();
        C1174B c1174b2 = new C1174B(this);
        this.f13405h = c1174b2;
        c1174b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a3 = c1174b2.a(keyListener);
            if (a3 != keyListener) {
                super.setKeyListener(a3);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C1218v getSuperCaller() {
        if (this.f13406i == null) {
            this.f13406i = new C1218v(this);
        }
        return this.f13406i;
    }

    @Override // P.InterfaceC0269q
    public final C0258f a(C0258f c0258f) {
        this.f13404g.getClass();
        return S.j.a(this, c0258f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13402e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13402e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13402e.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1174B c1174b;
        if (Build.VERSION.SDK_INT < 28 && (c1174b = this.f13403f) != null) {
            TextClassifier textClassifier = (TextClassifier) c1174b.f13042c;
            if (textClassifier == null) {
                return Q.a((TextView) c1174b.f13041b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i4;
        String[] g8;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13402e.getClass();
        W.h(editorInfo, onCreateInputConnection, this);
        h7.u.h(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i4 = Build.VERSION.SDK_INT) <= 30 && (g8 = P.O.g(this)) != null) {
            if (i4 >= 25) {
                editorInfo.contentMimeTypes = g8;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g8);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g8);
            }
            B1.b bVar = new B1.b(5, this);
            if (i4 >= 25) {
                eVar = new R.d(onCreateInputConnection, bVar);
            } else {
                String[] strArr = R.c.f4981a;
                if (i4 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new R.e(onCreateInputConnection, bVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f13405h.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 && i4 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z8 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && P.O.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z8 = E.a(dragEvent, this, activity);
            }
        }
        if (z8) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i4) {
        ClipData primaryClip;
        InterfaceC0255c interfaceC0255c;
        int i8;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31 && P.O.g(this) != null && (i4 == 16908322 || i4 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i9 >= 31) {
                    interfaceC0255c = new W0.c(primaryClip, 1);
                } else {
                    C0256d c0256d = new C0256d();
                    c0256d.f4254e = primaryClip;
                    c0256d.f4255f = 1;
                    interfaceC0255c = c0256d;
                }
                if (i4 == 16908322) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                interfaceC0255c.i(i8);
                P.O.i(this, interfaceC0255c.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13402e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13402e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.c.H0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f13405h.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f13405h.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13401d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13402e;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13402e;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        W w8 = this.f13402e;
        if (w8 != null) {
            w8.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1174B c1174b;
        if (Build.VERSION.SDK_INT < 28 && (c1174b = this.f13403f) != null) {
            c1174b.f13042c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
