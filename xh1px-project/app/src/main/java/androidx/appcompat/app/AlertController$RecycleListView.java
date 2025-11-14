package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC0805a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final int f8307d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8308e;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11292t);
        this.f8308e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f8307d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
