package o;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13153a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f13154b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f13155c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f13156d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f13157e;

    public X0(View view) {
        this.f13153a = (TextView) view.findViewById(R.id.text1);
        this.f13154b = (TextView) view.findViewById(R.id.text2);
        this.f13155c = (ImageView) view.findViewById(R.id.icon1);
        this.f13156d = (ImageView) view.findViewById(R.id.icon2);
        this.f13157e = (ImageView) view.findViewById(com.buzbuz.smartautoclicker.R.id.edit_query);
    }
}
