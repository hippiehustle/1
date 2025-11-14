package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.AbstractC0805a;

/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1214t {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f13379a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f13380b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13381c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13382d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13383e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f13384f;

    public /* synthetic */ C1214t(TextView textView) {
        this.f13384f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f13384f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f13381c || this.f13382d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f13381c) {
                    mutate.setTintList(this.f13379a);
                }
                if (this.f13382d) {
                    mutate.setTintMode(this.f13380b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C1212s c1212s = (C1212s) this.f13384f;
        Drawable checkMarkDrawable = c1212s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f13381c || this.f13382d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f13381c) {
                    mutate.setTintList(this.f13379a);
                }
                if (this.f13382d) {
                    mutate.setTintMode(this.f13380b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1212s.getDrawableState());
                }
                c1212s.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i4) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f13384f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0805a.f11285m;
        R.g J6 = R.g.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        P.O.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, i4);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(h4.g.k(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(J6.z(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(AbstractC1202m0.c(typedArray.getInt(3, -1), null));
                }
                J6.L();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(h4.g.k(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            J6.L();
        } catch (Throwable th) {
            J6.L();
            throw th;
        }
    }
}
