package m;

import C6.h0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.MenuC1100B;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041d extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12326a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f12327b;

    public C1041d(Context context, h0 h0Var) {
        this.f12326a = context;
        this.f12327b = h0Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f12327b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f12327b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1100B(this.f12326a, this.f12327b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f12327b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f12327b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f12327b.f751f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f12327b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f12327b.f750e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f12327b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f12327b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f12327b.l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f12327b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f12327b.f751f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f12327b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z8) {
        this.f12327b.q(z8);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.f12327b.m(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.f12327b.o(i4);
    }
}
