package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f12626d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f12627e;

    public h(i iVar) {
        this.f12627e = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f12627e.f12630f;
        o oVar = mVar.f12660v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f12626d = i4;
                    return;
                }
            }
        }
        this.f12626d = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        i iVar = this.f12627e;
        m mVar = iVar.f12630f;
        mVar.i();
        ArrayList arrayList = mVar.j;
        iVar.getClass();
        int i8 = this.f12626d;
        if (i8 >= 0 && i4 >= i8) {
            i4++;
        }
        return (o) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f12627e;
        m mVar = iVar.f12630f;
        mVar.i();
        int size = mVar.j.size();
        iVar.getClass();
        if (this.f12626d < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f12627e.f12629e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).a(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
