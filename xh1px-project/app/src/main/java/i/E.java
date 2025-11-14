package i;

import P.InterfaceC0262j;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public abstract class E extends c.m implements InterfaceC0871j {

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflaterFactory2C0860C f11598g;

    /* renamed from: h, reason: collision with root package name */
    public final C0861D f11599h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(Context context, int i4) {
        super(context, r2);
        int i8;
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i8 = typedValue.resourceId;
        } else {
            i8 = i4;
        }
        this.f11599h = new InterfaceC0262j() { // from class: i.D
            @Override // P.InterfaceC0262j
            public final boolean c(KeyEvent keyEvent) {
                return E.this.e(keyEvent);
            }
        };
        AbstractC0877p d2 = d();
        if (i4 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i4 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0860C) d2).f11571W = i4;
        d2.d();
    }

    @Override // c.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) d();
        layoutInflaterFactory2C0860C.u();
        ((ViewGroup) layoutInflaterFactory2C0860C.f11553D.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0860C.f11586p.a(layoutInflaterFactory2C0860C.f11585o.getCallback());
    }

    public final AbstractC0877p d() {
        if (this.f11598g == null) {
            ExecutorC0875n executorC0875n = AbstractC0877p.f11722d;
            this.f11598g = new LayoutInflaterFactory2C0860C(getContext(), getWindow(), this, this);
        }
        return this.f11598g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return D2.f.k(this.f11599h, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i4) {
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) d();
        layoutInflaterFactory2C0860C.u();
        return layoutInflaterFactory2C0860C.f11585o.findViewById(i4);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // c.m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // c.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = (LayoutInflaterFactory2C0860C) d();
        layoutInflaterFactory2C0860C.y();
        AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
        if (abstractC0862a != null) {
            abstractC0862a.v(false);
        }
    }

    @Override // c.m, android.app.Dialog
    public void setContentView(int i4) {
        c();
        d().h(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
    }

    @Override // c.m, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        super.setTitle(i4);
        d().k(getContext().getString(i4));
    }

    @Override // c.m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().j(view, layoutParams);
    }
}
