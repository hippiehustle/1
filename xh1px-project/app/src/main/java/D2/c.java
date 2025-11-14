package D2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends BaseAdapter implements Filterable {

    /* renamed from: d, reason: collision with root package name */
    public final List f861d;

    /* renamed from: e, reason: collision with root package name */
    public final M7.c f862e;

    /* renamed from: f, reason: collision with root package name */
    public final e f863f;

    /* renamed from: g, reason: collision with root package name */
    public final b f864g;

    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.Filter, D2.b] */
    public c(List list, M7.c cVar, e eVar) {
        o6.j.e(list, "items");
        this.f861d = list;
        this.f862e = cVar;
        this.f863f = eVar;
        this.f864g = new Filter();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f861d.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f864g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        return (d) this.f861d.get(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        Object obj;
        A4.c g8;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        List list = this.f861d;
        e eVar = this.f863f;
        if (obj != null && eVar != null) {
            eVar.j((d) list.get(((Integer) obj).intValue()), view, Boolean.FALSE);
        }
        if (view == null) {
            o6.j.b(viewGroup);
            g8 = A4.c.g(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_dropdown, viewGroup, false));
        } else {
            g8 = A4.c.g(view);
        }
        LinearLayout linearLayout = (LinearLayout) g8.f291e;
        d dVar = (d) list.get(i4);
        linearLayout.setOnClickListener(new a(this, 0, dVar));
        ((MaterialTextView) g8.f292f).setText(dVar.f865a);
        ImageView imageView = (ImageView) g8.f293g;
        imageView.setVisibility(8);
        imageView.setImageDrawable(null);
        linearLayout.setTag(Integer.valueOf(i4));
        if (eVar != null) {
            eVar.j(dVar, linearLayout, Boolean.TRUE);
        }
        return linearLayout;
    }
}
