package m;

import C6.h0;
import R3.r;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import g0.b0;
import java.lang.ref.WeakReference;
import n.m;
import o.C1197k;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040c extends h0 implements n.k {

    /* renamed from: g, reason: collision with root package name */
    public Context f12322g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContextView f12323h;

    /* renamed from: i, reason: collision with root package name */
    public r f12324i;
    public WeakReference j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public m f12325l;

    @Override // n.k
    public final void A(m mVar) {
        i();
        C1197k c1197k = this.f12323h.f8346g;
        if (c1197k != null) {
            c1197k.n();
        }
    }

    @Override // C6.h0
    public final void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f12324i.W(this);
    }

    @Override // C6.h0
    public final View c() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // C6.h0
    public final m e() {
        return this.f12325l;
    }

    @Override // C6.h0
    public final MenuInflater f() {
        return new C1044g(this.f12323h.getContext());
    }

    @Override // C6.h0
    public final CharSequence g() {
        return this.f12323h.getSubtitle();
    }

    @Override // C6.h0
    public final CharSequence h() {
        return this.f12323h.getTitle();
    }

    @Override // C6.h0
    public final void i() {
        this.f12324i.X(this, this.f12325l);
    }

    @Override // C6.h0
    public final boolean j() {
        return this.f12323h.f8359v;
    }

    @Override // C6.h0
    public final void l(View view) {
        WeakReference weakReference;
        this.f12323h.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.j = weakReference;
    }

    @Override // C6.h0
    public final void m(int i4) {
        n(this.f12322g.getString(i4));
    }

    @Override // C6.h0
    public final void n(CharSequence charSequence) {
        this.f12323h.setSubtitle(charSequence);
    }

    @Override // C6.h0
    public final void o(int i4) {
        p(this.f12322g.getString(i4));
    }

    @Override // C6.h0
    public final void p(CharSequence charSequence) {
        this.f12323h.setTitle(charSequence);
    }

    @Override // C6.h0
    public final void q(boolean z8) {
        this.f750e = z8;
        this.f12323h.setTitleOptional(z8);
    }

    @Override // n.k
    public final boolean z(m mVar, MenuItem menuItem) {
        return ((b0) this.f12324i.f5082e).p(this, menuItem);
    }
}
