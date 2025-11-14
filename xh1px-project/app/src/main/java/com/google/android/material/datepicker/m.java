package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m<S> extends s {

    /* renamed from: d0, reason: collision with root package name */
    public int f10127d0;

    /* renamed from: e0, reason: collision with root package name */
    public b f10128e0;

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10127d0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10128e0);
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f11115i;
        }
        this.f10127d0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f10128e0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.f10127d0));
        throw null;
    }
}
