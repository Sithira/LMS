/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author sithira
 */
public class SetOfMembers implements Serializable
{

    public final String TABLE_PATH = Paths.get(".")
            .toAbsolutePath()
            .normalize()
            .toString() + "/database/SetOfMembers.srlz";
    
    private ArrayList<Member> members = new ArrayList<Member>();

    public void addMember(Member member)
    {
        members.add(member);
    }
    
    public Member getMemberFromName(String name)
    {
        
        if (!members.isEmpty())
        {
            
            for (Member member : members)
            {
                if (member instanceof Member)
                {
                    if (member.getName().equals(name))
                    {
                        return member;
                    }
                }
            }
            
            return null;
            
        }
        
        return null;
        
    }
    
    public Member getMemberFromNumber(int number)
    {
        if (!members.isEmpty())
        {
            
            for (Member member : members)
            {
                if (member instanceof Member)
                {
                    if (member.getMemberNumber() == number)
                    {
                        return member;
                    }
                }
            }
            
            return null;
            
        }
        
        return null;
    }
    
    public void removeMember(Member member)
    {
        
        if (!members.isEmpty())
        {
           
            for (Member mb : members)
            {
                if (mb instanceof Member)
                {
                    if (mb.equals(member))
                    {
                        members.remove(mb);
                    }
                }
            }
          
        }
    }
    
    public ArrayList<Member> getMembers()
    {
        return members;
    }
    
}
