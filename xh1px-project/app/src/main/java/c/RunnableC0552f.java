package c;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.C0630f;
import e.InterfaceC0626b;
import java.io.Serializable;

/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0552f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9318g;

    public /* synthetic */ RunnableC0552f(C0553g c0553g, int i4, Object obj, int i8) {
        this.f9315d = i8;
        this.f9317f = c0553g;
        this.f9316e = i4;
        this.f9318g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9315d) {
            case 0:
                C0553g c0553g = (C0553g) this.f9317f;
                Serializable serializable = (Serializable) ((W0.c) this.f9318g).f6486e;
                String str = (String) c0553g.f9319a.get(Integer.valueOf(this.f9316e));
                if (str != null) {
                    C0630f c0630f = (C0630f) c0553g.f9323e.get(str);
                    if (c0630f != null) {
                        InterfaceC0626b interfaceC0626b = c0630f.f10567a;
                        if (c0553g.f9322d.remove(str)) {
                            interfaceC0626b.h(serializable);
                            return;
                        }
                        return;
                    }
                    c0553g.f9325g.remove(str);
                    c0553g.f9324f.put(str, serializable);
                    return;
                }
                return;
            case 1:
                ((C0553g) this.f9317f).a(this.f9316e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f9318g));
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((BottomSheetBehavior) this.f9317f).L((View) this.f9318g, this.f9316e, false);
                return;
            default:
                ((TextView) this.f9318g).setTypeface((Typeface) this.f9317f, this.f9316e);
                return;
        }
    }

    public RunnableC0552f(TextView textView, Typeface typeface, int i4) {
        this.f9315d = 3;
        this.f9318g = textView;
        this.f9317f = typeface;
        this.f9316e = i4;
    }

    public RunnableC0552f(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f9315d = 2;
        this.f9317f = bottomSheetBehavior;
        this.f9318g = view;
        this.f9316e = i4;
    }
}
