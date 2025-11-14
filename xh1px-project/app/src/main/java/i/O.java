package i;

import C6.h0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import g0.b0;
import java.lang.ref.WeakReference;
import m.C1044g;
import o.C1197k;

/* loaded from: classes.dex */
public final class O extends h0 implements n.k {

    /* renamed from: g, reason: collision with root package name */
    public final Context f11630g;

    /* renamed from: h, reason: collision with root package name */
    public final n.m f11631h;

    /* renamed from: i, reason: collision with root package name */
    public R3.r f11632i;
    public WeakReference j;
    public final /* synthetic */ P k;

    public O(P p8, Context context, R3.r rVar) {
        this.k = p8;
        this.f11630g = context;
        this.f11632i = rVar;
        n.m mVar = new n.m(context);
        mVar.f12650l = 1;
        this.f11631h = mVar;
        mVar.f12645e = this;
    }

    @Override // n.k
    public final void A(n.m mVar) {
        if (this.f11632i != null) {
            i();
            C1197k c1197k = this.k.f11640g.f8346g;
            if (c1197k != null) {
                c1197k.n();
            }
        }
    }

    @Override // C6.h0
    public final void b() {
        P p8 = this.k;
        if (p8.j != this) {
            return;
        }
        if (p8.f11648q) {
            p8.k = this;
            p8.f11643l = this.f11632i;
        } else {
            this.f11632i.W(this);
        }
        this.f11632i = null;
        p8.B(false);
        ActionBarContextView actionBarContextView = p8.f11640g;
        if (actionBarContextView.f8351n == null) {
            actionBarContextView.e();
        }
        p8.f11637d.setHideOnContentScrollEnabled(p8.f11653v);
        p8.j = null;
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
    public final n.m e() {
        return this.f11631h;
    }

    @Override // C6.h0
    public final MenuInflater f() {
        return new C1044g(this.f11630g);
    }

    @Override // C6.h0
    public final CharSequence g() {
        return this.k.f11640g.getSubtitle();
    }

    @Override // C6.h0
    public final CharSequence h() {
        return this.k.f11640g.getTitle();
    }

    @Override // C6.h0
    public final void i() {
        if (this.k.j != this) {
            return;
        }
        n.m mVar = this.f11631h;
        mVar.w();
        try {
            this.f11632i.X(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // C6.h0
    public final boolean j() {
        return this.k.f11640g.f8359v;
    }

    @Override // C6.h0
    public final void l(View view) {
        this.k.f11640g.setCustomView(view);
        this.j = new WeakReference(view);
    }

    @Override // C6.h0
    public final void m(int i4) {
        n(this.k.f11635b.getResources().getString(i4));
    }

    @Override // C6.h0
    public final void n(CharSequence charSequence) {
        this.k.f11640g.setSubtitle(charSequence);
    }

    @Override // C6.h0
    public final void o(int i4) {
        p(this.k.f11635b.getResources().getString(i4));
    }

    @Override // C6.h0
    public final void p(CharSequence charSequence) {
        this.k.f11640g.setTitle(charSequence);
    }

    @Override // C6.h0
    public final void q(boolean z8) {
        this.f750e = z8;
        this.k.f11640g.setTitleOptional(z8);
    }

    @Override // n.k
    public final boolean z(n.m mVar, MenuItem menuItem) {
        R3.r rVar = this.f11632i;
        if (rVar != null) {
            return ((b0) rVar.f5082e).p(this, menuItem);
        }
        return false;
    }
}
